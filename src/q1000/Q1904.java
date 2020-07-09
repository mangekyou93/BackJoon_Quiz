package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1904 {
	
	//백준 문제 1904 : 01타일
	
	//피보나치 수열에 15746을 나눈 나머지를 구하는 공식
	//메모리 : 68MB / 시간 : 0.256 s
	static int[] dp = new int[1000001];
	
	public static void main(String[] args) throws Exception {
		
		//n = 1 : 1		1
		//n = 2 : 2		11, 00
		//n = 3 : 3		111, 001, 100
		//n = 4 : 5		1111, 1001, 1100, 0011, 0000
		//n = 5 : 8		11100, 11001, 10011, 00111, 10000, 00001, 00100, 11111
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(f(n) % 15746);
	}
	
	public static int f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		dp[n] = (f(n-1) + f(n-2)) % 15746;
		
		return dp[n];
	}
}
