package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11053 {

	//백준 문제 11053 : 가장 긴 증가하는 부분 수열
	
	//2020-07-01 : 실패 ... 점화식을 못짜겠어ㅜ
	static int[][] dp;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		dp = new int[N][N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		/*
		int min = 1001;
		for(int i=0 ; i<N ; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			if(a < min) {
				min = a;
			}
		}
		
		dp[0][0] = arr[0];
		dp[1][0] = arr[0];
		dp[2][0] = min;
		dp[3][0] = min;
		
		int zCount = 0;
		int oCount = 0;
		int tCount = 0;
		int thCount = 0;
		boolean check = false;
		
		for(int i=1 ; i<N ; i++) {
			if(dp[0][zCount] < arr[i]) {
				dp[0][++zCount] = arr[i];
			}
			if(dp[0][oCount+1] == 0) {
				if(dp[1][oCount] < arr[i]) {
					dp[1][++oCount] = arr[i];
				}
			} else {
				if(dp[1][oCount] < arr[i] && dp[0][oCount+1] > arr[i]) {
					dp[1][++oCount] = arr[i];
				}
			}
			
			if(arr[i] == min) check = true;
			
			if(check) {
				if(dp[2][tCount] < arr[i]) {
					dp[2][++tCount] = arr[i];
				}
				if(dp[2][thCount+1] == 0) {
					if(dp[3][thCount] < arr[i]) {
						dp[3][++thCount] = arr[i];
					}
				} else {
					if(dp[3][thCount] < arr[i] && dp[2][thCount+1] > arr[i]) {
						dp[3][++thCount] = arr[i];
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(dp[0]));
		System.out.println(Arrays.toString(dp[1]));
		System.out.println(Arrays.toString(dp[2]));
		System.out.println(Arrays.toString(dp[3]));
		*/
		
	}
	
}
