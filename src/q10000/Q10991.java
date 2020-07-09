package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10991 {
	
	//백준 문제 10991 : 별 찍기 - 16
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=n ; j>i ; j--) {
				sb.append(" ");
			}
			for(int j=1 ; j<=(i*2)-1 ; j++) {
				if(j % 2 == 1) {
					sb.append("*");
				}else {
					sb.append(" ");
				}
			}
			
			sb.append("\n");
		}

		
		System.out.println(sb);
		br.close();
	}
}
