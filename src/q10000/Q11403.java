package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11403 {

	//백준 문제 11403 : 경로 찾기
	//메모리 : 15MB / 시간 : 0.132 s
	static int[][] G;
	static boolean[][] visited;
	static int N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		G = new int[N][N];
		visited = new boolean[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				G[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(G[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
				}
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(visited[i][j]) sb.append(1).append(" ");
				else sb.append(0).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	public static void dfs(int curr, int next) {
		visited[curr][next] = true;
		
		for(int i=0 ; i<N ; i++) {
			if(G[next][i] == 1 && !visited[curr][i]) dfs(curr, i);
		}
	}
}
