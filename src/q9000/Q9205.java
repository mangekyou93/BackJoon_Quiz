package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9205 {

	//���� ���� 9205 : ���� ���ø鼭 �ɾ��
	//�޸� : 14MB / �ð� : 0.104 s
	
	//��ƴ� �������� �����ϱⰡ..
	//���� Ǯ��� �ִµ� ��...
	//50 * 20 = 1000�̴ϱ� �������� ��ġ�°� 1000m�� ���� �� �ְ� ���ִϱ�
	//���� ���������� 1000m�̳��̸� ��� ���� �ȴ�.
	static int[][] road;
	static boolean[] visited;
	static Queue<int[]> q = new LinkedList<int[]>();
	static int[] end = new int[2];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			//�������� �� = n
			int n = Integer.parseInt(br.readLine());
			road = new int[n+2][2];
			visited = new boolean[n+2];
			
			//�������� �� + ����̿� ģ���� + �佺Ƽ�� = n + 2
			for(int i=0 ; i<n+2 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				road[i][0] = Integer.parseInt(st.nextToken());
				road[i][1] = Integer.parseInt(st.nextToken());
			}
			
			//���� ��ġ
			q.offer(new int[] {road[0][0], road[0][1]});
			//���� ��ġ
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
	//������ �߸� �ľ���..
	//�� 50m�� -> 1ĭ���� ��Ƽ� �̵��ߴµ�, �� ���� 50 ������ �����°� �ƴϸ�,
	//�׳� 1000m���� �������� ������ ��� ����, �������� ������ happy�� ����ϸ� �ȴ�.
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
			//�������� �� = n
			int n = Integer.parseInt(br.readLine());
			
			//������ ��ġ
			int[][] arr = new int[n][2];
			
			//����̿� ģ����
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			q.offer(new int[] {Integer.parseInt(st.nextToken())/50, Integer.parseInt(st.nextToken()) / 50, 20});
			
			//�������� �� + �佺Ƽ�� = n + 1
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
			
			//������ ��ġ ����
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
						//������ �鸲
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
