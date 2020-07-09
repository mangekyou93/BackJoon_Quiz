package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q2606 {

	//백준 문제 2606 : 바이러스
	//메모리 : 14MB / 시간 : 0.080 s
	static int N, count = 0;
	static ArrayList<Integer>[] adj;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		adj = new ArrayList[N+1];
		visited = new boolean[N+1];
		for(int i=1 ; i<N+1 ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		int M = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			adj[v].add(w);
			adj[w].add(v);
		}
		
		dfs(1);
		System.out.println(count-1);
	}
	
	public static void dfs(int n) {
		visited[n] = true;
		count++;
		for(int next : adj[n]) {
			if(!visited[next]) dfs(next);
		}
	}
	
}
