package q14000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14503 {

	//백준 문제 14503 : 로봇 청소기
	static int[][] area;
	static boolean[][] visited;
	static Queue<int[]> q = new LinkedList<int[]>();
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int count = 0;
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		area = new int[N][M];
		
		st = new StringTokenizer(br.readLine(), " ");
		q.offer(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<M ; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs();
	}
	
	public static void bfs() {
		visited[q.peek()[0]][q.peek()[1]] = true;
		count++;
		
		while(!q.isEmpty()) {
			int[] t = q.poll();
			
			int nx = t[0];
			int ny = t[1] - 1;
			int nd = t[2] - 1 < 0 ? 3 : t[2] - 1;
			
			if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
			if(!visited[nx][ny] && area[nx][ny] != 1) {
				q.offer(new int[] {nx, ny, nd});
				visited[nx][ny] = true;
			}
			else if(visited[nx][ny]) {
				for(int i=0 ; i<4 ; i++) {
					
				}
			}
			else {
				
			}
		}
	}
}
