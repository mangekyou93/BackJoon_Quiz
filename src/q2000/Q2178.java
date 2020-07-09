package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
	
	//백준 문제 2178 : 미로 탐색
	//메모리 : 14MB / 시간 : 0.096 s
	//일단 너무 억지로 짜긴 짬...
	//q에 좌표를 넣어주면서 했음.
	static int[][] arr;
	static int[][] visited;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N,M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visited = new int[N][M];
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		bfs(0, 0);
		System.out.println(visited[N-1][M-1]);
	}
	
	public static void bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		q.offer(y);
		arr[x][y] = 0;
		visited[x][y] = 1;
		
		int level = 2;
		while(!q.isEmpty()) {
			int qSize = q.size()/2;
			
			for(int i=0 ; i<qSize ; i++) {
				int nx = q.poll();
				int ny = q.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int a = nx + dx[j];
					int b = ny + dy[j];
					if(a >= 0 && b >= 0 && a < N && b < M) {
						//if(arr[nx][ny] != 0 && visited[nx][ny] == 0) {
						if(arr[a][b] != 0) {
							visited[a][b] = level;
							arr[a][b] = 0;
							q.offer(a);
							q.offer(b);
						}
					}
				}
			}
			level++;
		}
	}
}
