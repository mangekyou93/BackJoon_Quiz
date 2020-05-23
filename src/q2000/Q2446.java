package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2446 {

	
	//백준 문제 2446 : 별 찍기 -9
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<i ; j++) {
				sb.append(" ");
			}
			for(int k=2*(n-i)-1 ; k>0 ; k--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=i ; j<n-2 ; j++) {
				sb.append(" ");
			}
			for(int k=2*(i+1)+1 ; k>0 ; k--){
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
