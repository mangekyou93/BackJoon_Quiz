package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q9466 {

	//백준 문제 9466 : 텀 프로젝트
	//문제 읽어보니까 단방향그래프이고, 싸이클 찾는 문제
	
	//stack을 사용하니 시간 초과 나옴...
	//contains랑 pop을 계속 해줘서 그런가봄
	//메모리 : 286MB / 시간 : 1.004 s
	//시간은 아마도 n <= 10만까지라서 많은 것으로 생각
	//메모리는 student와, visited, finished를 계속 만들어줘서 그런거 같음.
	static int[] student;
	static boolean[] visited;
	static boolean[] finished;
	static int cnt, n;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			student = new int[n+1];
			visited = new boolean[n+1];
			finished = new boolean[n+1];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=1 ; i<=n ; i++) {
				student[i] = Integer.parseInt(st.nextToken());
			}
			
			cnt = 0;
			for(int i=1 ; i<=n ; i++) {
				dfs(i);
			}
			
			sb.append(n - cnt).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int n) {
		visited[n] = true;
		int next = student[n];
		
		if(visited[next]) {
			if(!finished[next]) {
				for(int i=next ; i!=n ; i=student[i]) cnt++;
				cnt++;		//자기 자신
			}
		}
		else dfs(next);
		finished[n] = true;
	}
}
