package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5567 {

	//백준 문제 5567 : 결혼식
	//분류 : 구현,그래프 이론
	//메모리 : 19MB / 시간 : 0.172 s
	
	//BFS로 풀었음...
	//근데 이게 그래프 문제(BFS,DFS)인지, DP인제, 그리드인지 감이 안잡힌다..
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		ArrayList<Integer>[] adj = new ArrayList[n+1];
		for(int i=1 ; i<n+1 ; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		int[] visited = new int[n+1];
		
		for(int i=0 ; i<m ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			adj[x].add(y);
			adj[y].add(x);
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		visited[1] = 1;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			
			for(int next : adj[curr]) {
				if(visited[next] == 0) {
					visited[next] = visited[curr] + 1;
					q.offer(next);
				}
			}
		}
		
		int count = 0;
		for(int i=2 ; i<visited.length ; i++) {
			if(visited[i] == 2 || visited[i] == 3) count++;
		}
		
		System.out.println(count);
	}
	
	/*
	//bfs임..
	//상근이와 친구들의 관계를 무방향 그래프로 설계
	//상근이와 친구들의 관계를 그래프로 나타내었을 때, 시작점(상근이)으로부터 최단거리가 2이하인 정점의 개수를 구하시오.
	static int[][] friends;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashSet<Integer> hs = new HashSet<Integer>();
		int N = Integer.parseInt(br.readLine());			// N : 동기의 수	(2 <= n <= 500)
		int M = Integer.parseInt(br.readLine());			// M : 리스트의 길이	(1 <= M <= 10000)
		
		friends = new int[M][2];
				
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			friends[i][0] = a;
			friends[i][1] = b;
			
			if(a == 1) {
				hs.add(b);
			}
		}
		
		Arrays.sort(friends, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		int count = hs.size();
		
		for(int i=0 ; i<M ; i++) {
			if(hs.contains(friends[i][0]) && !hs.contains(friends[i][1])) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	*/
}
