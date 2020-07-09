package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2522 {
	
	//백준 문제 2522 : 별 찍기 - 12
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=n ; j>0 ; j--) {
				if(j <= i) {
					sb.append("*");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ; j++) {
				if(j <= i) {
					sb.append(" ");
				} else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
