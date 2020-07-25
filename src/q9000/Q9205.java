package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9205 {

	//백준 문제 9205 : 맥주 마시면서 걸어가기
	//메모리 : 14MB / 시간 : 0.104 s
	
	//어렵다 문제조차 이해하기가..
	//많이 풀어보곤 있는데 후...
	//50 * 20 = 1000이니까 편의점을 거치는게 1000m를 가줄 수 있게 해주니까
	//다음 편의점까지 1000m이내이면 계속 가면 된다.
	static int[][] road;
	static boolean[] visited;
	static Queue<int[]> q = new LinkedList<int[]>();
	static int[] end = new int[2];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			//편의점의 수 = n
			int n = Integer.parseInt(br.readLine());
			road = new int[n+2][2];
			visited = new boolean[n+2];
			
			//편의점의 수 + 상근이와 친구들 + 페스티벌 = n + 2
			for(int i=0 ; i<n+2 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				road[i][0] = Integer.parseInt(st.nextToken());
				road[i][1] = Integer.parseInt(st.nextToken());
			}
			
			//시작 위치
			q.offer(new int[] {road[0][0], road[0][1]});
			//도착 위치
			end[0] = road[n+1][0];
			end[1] = road[n+1][1];
			
			sb.append(bfs(n)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static String bfs(int n) {
		
		while(!q.isEmpty()) {
			int[] t = q.poll();
			
			if(t[0] == end[0] && t[1] == end[1]) {
				return "happy";
			}
			
			for(int i=1 ; i<n+2 ; i++) {
				if(!visited[i] && Math.abs(t[0] - road[i][0]) + Math.abs(t[1] - road[i][1]) <= 1000) {
					q.offer(new int[] {road[i][0], road[i][1]});
					visited[i] = true;
				}
			}
		}
		
		return "sad";
	}
	
	
	
	
	/*
	//문제를 잘못 파악함..
	//난 50m를 -> 1칸으로 잡아서 이동했는데, 꼭 값이 50 단위로 나오는게 아니며,
	//그냥 1000m내에 편의점이 있으면 계속 가고, 목적지가 있으면 happy를 출력하면 된다.
	static Queue<int[]> q = new LinkedList<int[]>();
	static int[][] road;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[] end = new int[2];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			//편의점의 수 = n
			int n = Integer.parseInt(br.readLine());
			
			//편의점 위치
			int[][] arr = new int[n][2];
			
			//상근이와 친구들
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			q.offer(new int[] {Integer.parseInt(st.nextToken())/50, Integer.parseInt(st.nextToken()) / 50, 20});
			
			//편의점의 수 + 페스티벌 = n + 1
			for(int i=0 ; i<n+1 ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken()) / 50;
				int y = Integer.parseInt(st.nextToken()) / 50;
				
				if(i == n) {
					end[0] = x;
					end[1] = y;
					road = new int[x+1][y+1];
					visited = new boolean[x+1][y+1];
					break;
				}
				arr[i][0] = x;
				arr[i][1] = y;
			}
			
			//편의점 위치 세팅
			for(int i=0 ; i<n ; i++) {
				road[arr[i][0]][arr[i][1]] = 1;
			}
			
			sb.append(bfs()).append("\n");
			q.clear();
		}
		
		System.out.println(sb);
	}
	
	
	public static String bfs() {
		visited[q.peek()[0]][q.peek()[1]] = true;
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			
			for(int i=0 ; i<qSize ; i++) {
				int[] t = q.poll();
				
				if(t[0] == end[0] && t[1] == end[1]) {
					return "happy";
				}
				
				for(int j=0 ; j<4 ; j++) {
					int nx = t[0] + dx[j];
					int ny = t[1] + dy[j];
					
					if(nx >= 0 && nx < road.length && ny >= 0 && ny < road[0].length) {
						//편의점 들림
						if(road[nx][ny] > 0) t[2] = 20;
						else if(!visited[nx][ny] && t[2] > 0) {
							visited[nx][ny] = true;
							q.offer(new int[] {nx, ny, t[2] - 1});
						}
					}
				}
			}
		}
		
		return "sad";
	}
	*/
}
