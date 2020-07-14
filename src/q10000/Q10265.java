package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10265 {

	//백준 문제 10265 : MT
	
	//DP인 것도 알겠음. 이유 : 각각의 합이 k와 같거나 작아야되고, 만약 k == 싸이클 or 컴포넌트 수이면 그걸 출력하면 되니까.
	//
	static int[] human;
	static int cycle;
	static boolean[] visited;
	static boolean[] finished;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());		//사람 수
		int k = Integer.parseInt(st.nextToken());		//버스에 태울 수 있는 사람 수
		human = new int[n+1];
		visited = new boolean[n+1];
		finished = new boolean[n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1 ; i<human.length ; i++) {
			human[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for(int i=1 ; i<human.length ; i++) {
			if(!visited[i]) {
				cycle = 0;
				dfs(i);
			}
			if(cycle == k) {
				sum = cycle;
			} else if(sum + cycle <= k) {
				sum += cycle;
			}
		}
		
		System.out.println(sum);
	}
	
	
	public static void dfs(int curr) {
		visited[curr] = true;
		int next = human[curr];
		if(visited[next]) {
			if(!finished[next]) {
				for(int i=next ; i!=curr ; i=human[i]) {
					cycle++;
				}
				cycle++;
			}
		}else {
			dfs(next);
		}
		finished[curr] = true;
	}
}
