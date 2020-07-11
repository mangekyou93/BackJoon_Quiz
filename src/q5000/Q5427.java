package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5427 {

	//백준 문제 5427 : 불
	//메모리 : 91MB / 시간 : 0.820 s
	//불이 옮겨진 칸 또는 이제 "불이 붙으려는 칸"
	//"이제 불이 붙으려는 칸" : 불을 먼저 이동시켜야 함.
	static char[][] room;
	static int[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int W,H;
	static Queue<int[]> fire = new LinkedList<int[]>();			//불 이동 큐
	static Queue<int[]> human = new LinkedList<int[]>();		//사람 이동 큐
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			room = new char[H][W];
			visited = new int[H][W];
			
			for(int i=0; i<H ; i++) {
				String s = br.readLine();
				for(int j=0 ; j<s.length(); j++) {
					char ch = s.charAt(j);
					room[i][j] = ch;
					
					//시작 지점
					if(ch == '@') {
						human.offer(new int[] {i, j});
						visited[i][j] = 1;
					}
					
					//불 위치 저장
					else if(ch == '*') {
						fire.offer(new int[] {i,j});
						visited[i][j] = -1;
					}
				}
			}
			
			bfs();
			
			int count = Integer.MAX_VALUE;
			for(int i=0 ; i<H ; i++) {
				for(int j=0 ; j<W ; j++) {
					if((i == 0 || j == 0) || (i == H-1 || j == W-1)) {					//모서리 체크
						if(visited[i][j] == 0 || visited[i][j] == -1) continue;			//불,벽,못 감 체크
						count = Math.min(count, visited[i][j]);
					}
				}
			}
			sb.append(count == Integer.MAX_VALUE ? "IMPOSSIBLE" : count).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	public static void bfs() {
		
		while(!human.isEmpty() || !fire.isEmpty()) {
			int hSize = human.size();
			int fSize = fire.size();
			
			//불 이동 먼저
			for(int i=0 ; i<fSize ; i++) {
				int[] f = fire.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = f[0] + dx[j];
					int ny = f[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
						if(room[nx][ny] == '.' && visited[nx][ny] == 0) {
							room[nx][ny] = '*';
							visited[nx][ny] = -1;
							fire.offer(new int[] {nx, ny});
						}
					}
				}
			}
			
			//사람 이동 나중
			for(int i=0 ; i<hSize ; i++) {
				int[] h = human.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = h[0] + dx[j];
					int ny = h[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
						if(room[nx][ny] == '.' && visited[nx][ny] == 0) {
							visited[nx][ny] = visited[h[0]][h[1]] + 1;
							human.offer(new int[] {nx, ny});
						}
					}
				}
			}
		}
	}
}
