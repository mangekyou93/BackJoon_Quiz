package algorithm.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	//시간복잡도 : O(V+E) = 정점의 개수 + 간선의 개수
	int V;
	ArrayList<Integer>[] adj;
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
	
	//간선 추가
	//간선에는 방향이 있는데, 무방향과 방향이 있음.
	//양쪽으로 추가 해주면 무방향임.
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);			//이거를 제거하면 단방향
	}
	
	//bfs 시작
	public void bfs() {
		Arrays.fill(visited, false);
		Queue<Integer> q = new LinkedList<Integer>();		//BFS는 큐를 사용한다.
		visited[0] = true;
		q.offer(0);
		
		int level = 0;
		while(!q.isEmpty()) {
			int qSize = q.size();
			
			System.out.println("level : "+level);
			for(int i=0 ; i<qSize ; i++) {
				int curr = q.poll();
				
				System.out.println("node "+curr+" visited");
				for(int next : adj[curr]) {
					if(!visited[next]) {
						visited[next] = true;
						q.offer(next);
					}
				}
			}
			level++;
		}
		
	}
	
	public static void main(String[] args) {
		Graph G = new Graph(9);
		G.addEdge(0, 1);
	    G.addEdge(0, 2);
	    G.addEdge(1, 3);
	    G.addEdge(1, 5);
	    G.addEdge(3, 4);
	    G.addEdge(4, 5);
	    G.addEdge(2, 6);
	    G.addEdge(2, 8);
	    G.addEdge(6, 7);
	    G.addEdge(6, 8);
	    G.bfs();
	}
}
