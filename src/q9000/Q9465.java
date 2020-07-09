package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9465 {
	
	//백준 문제 9465 : 스티커
	//분류 : 다이나믹 프로그래밍(DP)
	
	//라이님 블로그 참조.
	//동적 프로그래밍의 기초
	static int[][] arr = new int[2][100000];
	static int[][] dp = new int[100000][3];
	static int n, sum = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			for(int i=0; i<2 ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0 ; j<n ; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0 ; i<n ; i++) {
				for(int j=0 ; j<3 ; j++) {
					dp[i][j] = -1;
				}
			}
			
			sb.append(sticker(0, 0)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int sticker(int c, int status) {
		if(c == n) return 0;
		if(dp[c][status] != -1) return dp[c][status];
		
		int result = sticker(c+1, 0);
		if(status != 1) result = Math.max(result, sticker(c+1, 1) + arr[0][c]);
		if(status != 2) result = Math.max(result, sticker(c+1, 2) + arr[1][c]);
		dp[c][status] = result;
		return result;
	}
	
}
