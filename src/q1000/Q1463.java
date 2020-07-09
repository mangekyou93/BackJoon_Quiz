package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1463 {

	//백준 문제 1463 : 1로 만들기
	//분류 : 다이나믹 프로그래밍(DP)
	
	//내가 그냥 반복문으로 못 짠 이유
	//10이면,
	//10 - 1 = 9	...	1
	//9  / 3 = 3	...	2
	//3  / 3 = 1	...	3
	//3번만에 나오는데
	
	//반복문
	//10 / 2 = 5	... 1
	//5  - 1 = 4	... 2
	//4  / 2 = 2	... 3
	//2  / 2 = 1	... 4
	
	//총 4번이 나온다.
	static int[] dp = new int[1000001];
	static int max = 1000001;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(f(N));
		
	}
	
	public static int f(int n) {
		if(n == 1) return 0;
		if(dp[n] != 0) return dp[n];			//메모이제이션 : 가장 중요한 개념, 이게 없으면 재귀돌릴 때 엄청 느리다.
		
		int result = f(n-1) + 1;
		if(n%3 == 0) result = Math.min(result, f(n/3) + 1);
		if(n%2 == 0) result = Math.min(result, f(n/2) + 1);
		dp[n] = result;
		return result;
	}
	
}
