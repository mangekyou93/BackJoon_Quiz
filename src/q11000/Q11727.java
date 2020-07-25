package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11727 {

	//백준 문제 11727 : 2xn 타일링 2
	//메모리 : 13MB / 시간 : 0.080 s
	
	//피보나치 수열(?) 문제
	//2*f(n-2) + f(n-1)
	
	//이런 문제 나오면 틀릴꺼 같음..
	//난 2^n - f(n-1)로 했는데
	//n == 62까지 똑같음....
	//63부터 7937 , 7936으로 달라짐...
	static long[] dp = new long[1001];
	//static long[] dp2 = new long[1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 3;
		//dp2[1] = 1;
		//dp2[2] = 3;
		
		System.out.println(f(N) % 10007);
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = (2*f(n-2) + f(n-1)) % 10007;
		dp[n] = result;
		return result;
	}
	
	/*
	public static long f2(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp2[n] != 0) return dp2[n];
		
		long result = (long)Math.pow(2, n) - f2(n-1);
		dp2[n] = result;
		return result;
	}
	*/
}
