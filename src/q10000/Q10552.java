package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10552 {

	//백준 문제 10552 : DOM (영어로 된 문제...)
	
	//2020-07-12 실패
	static int[] edge;
	static boolean[] visited;
	static int count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		edge = new int[M+1];
		visited = new boolean[M+1];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			edge[v] = w;
		}
		
		dfs(P);
	}
	
	public static void dfs(int curr) {
		
	}
}
