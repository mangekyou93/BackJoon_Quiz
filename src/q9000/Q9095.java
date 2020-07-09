package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9095 {

	//백준 문제 9095 : 1, 2, 3 더하기
	//분류 : 다이나믹프로그래밍
	static int[] dp = new int[11];
	
	public static void main(String[] args) throws Exception {
		
		//n = 0 , dp[0] = 1		?? 여기서부터 이해가 안됨
		//n = 1 , dp[1] = 1		1,2,3 숫자 중 1개 이상을 사용한다고 해서 1이 합이아니라 그냥 1이여도 가능함..
		//n = 2 , dp[2] = 2
		//n = 3 , dp[3] = 4
		//n = 4 , dp[4] = 7
		//dp[n] = dp[n-1] + dp[n-2] + dp[n-3]		: 점화식
		//식이 성립한다...
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(plus(n)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static int plus(int n) {
		if(dp[n] > 0) return dp[n];
		
		dp[n] = plus(n-1) + plus(n-2) + plus(n-3);
		
		return dp[n];
	}
	
}
