package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {
	
	//백준 문제 1932 : 정수 삼각형
	
	//2020-06-18 실패...
	static int[] arr;
	static int[][] dp;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+2][1001];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int k = st.countTokens();
			arr = new int[k];
			
			for(int j=0 ; j<k ; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			sum(k);
			System.out.println();
		}
		
	}
	
	public static void sum(int n) {
		if(n == 1) {
			dp[n][0] = arr[0];
			return ;
		}
		int cnt = 0;
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=i ; j<=i+1 ; j++) {
				int a = dp[n-1][i] + arr[j];
				dp[n][cnt] = a;
				System.out.print(dp[n][cnt]+" ");
				cnt++;
			}
		}
		
		return ;
	}
}
