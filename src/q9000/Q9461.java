package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9461 {
	
	//백준 문제 9461 : 파도반 수열
	
	//n의 범위가 100이니까 long타입으로 해줘야함.
	static long[] dp = new long[101];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(p(n)).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static long p(int n) {
		if(n <= 3) return 1;
		if(dp[n] != 0) return dp[n];
		
		
		dp[n] = p(n-2) + p(n-3);
		
		return dp[n];
	}
	
}
