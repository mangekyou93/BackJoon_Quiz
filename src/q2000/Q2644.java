package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2644 {

	//백준 문제 2644 : 촌수계산
	//level로 비교하면 되는데
	//생각이 안난다.
	//count 배열을 줘서 다음 레벨로 넘어갈 때 이전 레벨 + 1해주면 됨.
	//메모리 : 14MB / 시간 : 0.080 s
	static int V;
	static ArrayList<Integer>[] adj;
	static boolean[] visited;
	static int[] count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		V = Integer.parseInt(br.readLine());
		adj = new ArrayList[V+1];
		visited = new boolean[V+1];
		count = new int[V+1];
		for(int i=0 ; i<V+1 ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int E = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<E ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adj[x].add(y);
			adj[y].add(x);
		}
		
		bfs(a);
		System.out.println(count[b] > 0 ? count[b] : -1);
	}
	
	public static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visited[n] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			for(int next : adj[curr]) {
				if(!visited[next]) {
					visited[next] = true;
					q.offer(next);
					count[next] = count[curr] + 1;
				}
			}
		}
	}
	
}
