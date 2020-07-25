package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2294 {

	//백준 문제 2294 : 동전 2
	static int[] coin;
	static int[][] count;
	static int n, k;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		coin = new int[n];
		count = new int[n][10001];
		
		for(int i=0 ; i<n ; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(coin);
		
		dp(k, 0);
		
		int min = Integer.MAX_VALUE;
		for(int i=0 ; i<n ; i++) {
			min = Math.min(min , count[i][k]);
		}
	}
	
	public static int dp(int x, int c) {
		if(x == 1) {
			
		}
		if(count[c][x] != 0) return count[c][x];
		
		for(int i=0 ; i<n ; i++) {
			count[i][x] = dp(x-1, i) / coin[i];
		}
		
		return 1;
	}
}
