package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q6376 {

	//백준 문제 6376 : e 계산
	//분류 : 입문용
	static int[] dp = new int[10];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp[0] = 1;
		f(9);
		
		System.out.println("n e");
		System.out.println("- -----------");
		for(int i=0 ; i<10 ; i++) {
			double sum = 0;
			
			for(int j=0 ; j<=i ; j++) {
				sum += (double)1/dp[j];
				
			}
			if ((i == 0) || (i == 1))
				System.out.printf("%d %.0f\n", i, sum);
			else if (i == 2)
				System.out.printf("%d %.1f\n", i, sum);
			else
				System.out.printf("%d %.9f\n", i, sum);
			
		}
		
	}
	
	public static int f(int n) {
		if(n == 0) return 1;
		if(dp[n] != 0) return dp[n];
		
		dp[n] = n * f(n-1);
		
		return dp[n];
	}
}
