package algorithm.dfs;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {

	//�ð����⵵ : O(V+E) = ������ ���� + ������ ����
	//����(vertext), ����(edge)
	//���� ���(component) : �������� ������Ʈ�� ���� �� ����.
	//����Ŭ(cycle) : ������ �������� ���ƿ��� ��θ� ���Ѵ�. 1->2->3->1 : �̷������� 1�� �����ؼ� 1�� ���ƿ´�.
	int V;
	ArrayList<Integer>[] adj;		//adjacent : �����Ѵ�.
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
	
	//dfs ����
	public void dfs(){
		Arrays.fill(visited, false);
		dfs(0);
	}
	
	//dfs �����ε�
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
	
	//������Ʈ�� �������� ��� ��� �����Ű�� ���� ��
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
