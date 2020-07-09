package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2748 {

	//백준 문제 2748 : 피보나치 수 2
	static long[] dp = new long[91];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		System.out.println(fibonacci2(n));
		
		
	}
	
	public static long fibonacci2(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		dp[n] = fibonacci2(n-1) + fibonacci2(n-2);
		
		return dp[n];
	}
}
