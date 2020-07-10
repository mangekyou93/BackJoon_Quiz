package algorithm.dfs;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

	//시간복잡도 : O(V+E) = 정점의 개수 + 간선의 개수
	//정점(vertext), 간선(edge)
	//연결 요소(component) : 여러개의 컴포넌트가 있을 수 있음.
	//싸이클(cycle) : 시작한 정점으로 돌아오는 경로를 말한다. 1->2->3->1 : 이런식으로 1로 시작해서 1로 돌아온다.
	int V;
	ArrayList<Integer>[] adj;		//adjacent : 인접한다.
	boolean[] visited;
	
	public Graph() {
		V = 0;
	}
	
	public Graph(int v) {
		V = v;
		adj = new ArrayList[v];
		visited = new boolean[v];
		for(int i=0 ; i<v ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
	}
	
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	//dfs 시작
	public void dfs(){
		Arrays.fill(visited, false);
		dfs(0);
	}
	
	//dfs 오버로딩
	public int dfs(int curr) {
		visited[curr] = true;
		int nodes = 1;
		System.out.println("node "+curr+" visited");
		for(int next : adj[curr]) {
			if(!visited[next]) {
				nodes += dfs(next);
			}
		}
		
		return nodes;
	}
	
	//컴포넌트가 여러개인 경우 모두 실행시키기 위한 것
	public void dfsAll() {
		Arrays.fill(visited, false);
		int component = 0;
		for(int i=0 ; i<V ; i++) {
			if(!visited[i]) {
				System.out.println("-- new DFS begins --");
				int nodes = dfs(i);
				System.out.println("nodes : "+nodes);
				component++;
			}
		}
		System.out.println("The number of component is "+component);
	}
	
	
	public static void main(String[] args) {
		Graph G = new Graph(10);
		G.addEdge(0, 1);
	    G.addEdge(1, 3);
	    G.addEdge(2, 3);
	    G.addEdge(4, 6);
	    G.addEdge(5, 7);
	    G.addEdge(5, 8);
	    G.addEdge(7, 8);
	    G.dfsAll();
	}
	
}
