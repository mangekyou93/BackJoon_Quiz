package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293 {

	//백준 문제 2293 : 동전 1
	//분류 : 다이나믹 프로그래밍
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		int[] dp = new int[k+1];
		
		for(int i=0 ; i<n ; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		
		//2, 1, 3 이라고 할 때
		//2는 0 1 0 1 0 1 0
		//1은 1 2 2 3 3 4 4 
		//3은 1 2 3 4 5 7 8 
		
		//순서대로 2원 동전부터 쭉 만들고,
		//그 다음 1원 동전으로 2원 동전 갯수 + 1원 동전 갯수 = dp[]
		//마지막 3원 동전으로 (2원 동전 갯수 + 1원 동전 갯수) + 3원 동전 갯수 = dp[]
		//의 경우의 수가 완성된다.
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<k+1 ; j++) {
				if(j >= coin[i]) {
					dp[j] = dp[j] + dp[j-coin[i]];
				}
			}
		}
		
		System.out.println(dp[k]);
	}
	
}
