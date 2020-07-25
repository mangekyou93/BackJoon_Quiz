package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11726 {

	//백준 문제 11726 : 2xn 타일링
	//메모리 : 13MB / 시간 : 0.080 s
	
	//이것도 피보나치 수열 문제
	//단, dp[2] = 2
	static long[] dp = new long[1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(f(N) % 10007);
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = (f(n-1) + f(n-2)) % 10007;
		dp[n] = result;
		return result;
	}
}
