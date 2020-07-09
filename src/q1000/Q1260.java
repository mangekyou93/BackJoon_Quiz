package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {

	//백준 문제 1260 : DFS와 BFS
	//메모리 : 19MB / 시간 : 0.180 s
	static int N;
	static ArrayList<Integer>[] adj;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		adj = new ArrayList[N+1];
		
		for(int i=1 ; i<N+1 ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		//양방향 그래프
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			adj[v].add(w);
			adj[w].add(v);
		}
		
		for(int i=1 ; i<N+1 ; i++) {
			Collections.sort(adj[i]);
		}

		visited = new boolean[N+1];
		dfs(V);
		sb.append("\n");
		visited = new boolean[N+1];
		bfs(V);
		System.out.println(sb);
	}
	
	public static void dfs(int curr) {
		visited[curr] = true;
		sb.append(curr).append(" ");
		for(int next : adj[curr]) {
			if(!visited[next]) dfs(next);
		}
	}
	
	public static void bfs(int curr) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(curr);
		visited[curr] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			sb.append(temp).append(" ");
			for(int next : adj[temp]) {
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
				}
			}
		}
	}
	
}
