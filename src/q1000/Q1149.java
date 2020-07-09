package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
	
	//백준 문제 1149 : RGB거리
	//탑 다운 방법 실패 (2020-06-18)
	static int[][] homes;
	static int[][] dp = new int[1001][3];
	static int N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		homes = new int[N+1][3];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			homes[i][0] = Integer.parseInt(st.nextToken());
			homes[i][1] = Integer.parseInt(st.nextToken());
			homes[i][2] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][0] = homes[0][0];		//빨강 시작
		dp[0][1] = homes[0][1];		//초록 시작
		dp[0][2] = homes[0][2];		//파랑 시작
		
		dp(N, 0);
	}
	
	public static int dp(int n, int status) {
		if(n == 0) return 0;
		if(dp[n][status] != 0) return dp[n][status];
		
		int result = 0;
		if(status == 0) result = dp(n-1, 0) + Math.min(homes[n][1], homes[n][2]);
		if(status == 1) result = dp(n-1, 1) + Math.min(homes[n][0], homes[n][2]);
		if(status == 2) result = dp(n-1, 2) + Math.min(homes[n][0], homes[n][1]);
		
		dp[n][status] = result;
		return result;
		
	}
	
	/*
	static int r, g, b;
	static int n;
	static int[][] rgb;
	static int[][] dp = new int[1000][3];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		rgb = new int[n][3];
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<3 ; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			rgb[i][0] = Integer.parseInt(st.nextToken());
			rgb[i][1] = Integer.parseInt(st.nextToken());
			rgb[i][2] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(paint(0, 0));
		
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");

			r = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			
		}
		
	}
	
	public static int paint(int c, int position) {
		if(c == n) return 0;
		if(dp[c][position] != Integer.MAX_VALUE) return dp[c][position];
		
		int result = paint(c+1, 0);
		if(position == 0) result = Math.min(paint(c+1, 1), paint(c+1, 2)) + rgb[c][position];
		if(position == 1) result = Math.min(paint(c+1, 0), paint(c+1, 2)) + rgb[c][position];
		if(position == 2) result = Math.min(paint(c+1, 0), paint(c+1, 1)) + rgb[c][position];
		
		dp[c][position] = result;
		return result;
	}
	*/
}
