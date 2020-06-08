package q15000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {

	//백준 문제 15650 : N과 M (2)
	static StringBuilder sb = new StringBuilder();
	static int[] check, list;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		check = new int[9];
		list = new int[9];
		
		dfs(n, m, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int n, int m, int cnt) {
		
		if(cnt == m) {
			
			for(int i=0 ; i<m ; i++) {
				sb.append(list[i]+" ");
			}
			sb.append("\n");
			return ;
		}
		
		for(int i=1 ; i<=n ; i++) {
			
			if(check[i] == 1) continue;
			check[i] = 1;
			list[cnt] = i;
			dfs(n,m,cnt+1);
			check[i] = 0;
		}
	}

}
