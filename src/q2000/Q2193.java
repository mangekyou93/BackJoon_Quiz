package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2193 {

	//백준 문제 2193 : 이친수
	//메모리 : 13MB / 시간 : 0.080 s
	
	//갯 수를 구하는 것이라서 피보나치 수열 구하는 문제
	//피보나치 수열은 점점 커져서 N <= 90이면 long을 써야함
	//만약 다 찍어보는 것이면 피보나치로 풀 수 없음..
	static long[] dp = new long[91];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		
		System.out.println(f(N));
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = f(n-1) + f(n-2);
		dp[n] = result;
		return result;
	}
}
