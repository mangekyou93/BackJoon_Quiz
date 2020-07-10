package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2583 {

	//백준 문제 2583 : 영역 구하기
	//분류 : DFS, BFS
	//메모리 : 14MB / 시간 : 0.084 s
	static int[][] square;
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int M, N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		square = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0 ; i<K ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j=y1 ; j<y2 ; j++) {
				for(int k=x1 ; k<x2 ; k++) {
					square[j][k] = 1;
				}
			}
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int component = 0;
		for(int i=0 ; i<M ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(square[i][j] == 0 && !visited[i][j]) {
					pq.offer(dfs(i, j));
					component++;
				}
			}
		}
		
		while(!pq.isEmpty()) {
			sb.append(pq.poll()).append(" ");
		}
		System.out.println(component);
		System.out.println(sb);
	}
	
	public static int dfs(int x, int y) {
		visited[x][y] = true;
		int count = 1;
		
		for(int i=0 ; i<4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
				if(square[nx][ny] == 0 && !visited[nx][ny]) {
					count += dfs(nx, ny);
				}
			}
		}
		
		return count;
	}
}
