package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2523 {

	//백준 문제 2523 : 별 찍기 - 13
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<=i ; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=n-1 ; j>i ; j--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
