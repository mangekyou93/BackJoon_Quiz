package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1012 {
	
	//백준 문제 1012 : 유기농 배추
	//메모리 : 15MB / 시간 : 0.108 s
	//메모리 : 15MB / 시간 : 0.112 s			//방문 배열 추가한 것
	//시간이 조금이라도 줄어들 줄 알았는데 아니였음..
	static int[][] cabbage;
	static boolean[][] visited;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int M,N,K;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			cabbage = new int[N][M];
			visited = new boolean[N][M];
			
			for(int i=0 ; i<K ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				cabbage[b][a] = 1;
			}
			
			int count = 0;
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<M ; j++) {
					if(cabbage[i][j] == 1) {
						count++;
						dfs(i, j);
					}
				}
			}
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int x, int y) {
		if(visited[x][y]) return ;
		cabbage[x][y] = 0;
		visited[x][y] = true;
		
		for(int i=0 ; i<4 ; i++) {
			int xk = x + dx[i];
			int yk = y + dy[i];
			
			if(xk >= 0 && yk >= 0 && xk < N && yk < M) {
				if(cabbage[xk][yk] == 1) dfs(xk, yk);
			}
		}
		
	}
}
