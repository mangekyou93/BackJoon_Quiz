package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11724 {

	//백준 문제 11724 : 연결 요소의 개수
	//메모리 : 147MB / 시간 : 0.620 s
	static ArrayList<Integer>[] adj;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());			//정점의 개수
		int M = Integer.parseInt(st.nextToken());			//간선의 개수
		
		adj = new ArrayList[N+1];
		visited = new boolean[N+1];
		for(int i=1 ; i<adj.length ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			adj[u].add(v);
			adj[v].add(u);
		}
		
		int component = 0;
		for(int i=1 ; i<N+1 ; i++) {
			if(!visited[i]) {
				dfs(i);
				component++;
			}
		}
		System.out.println(component);
	}
	
	public static void dfs(int curr) {
		visited[curr] = true;
		
		for(int next : adj[curr]) {
			if(!visited[next]) dfs(next);
		}
	}
}
