package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10992 {
	
	//백준 문제 10992 : 별 찍기 - 17
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=n ; j>i ; j--) {
				sb.append(" ");
			}
			if(i != n) {
				for(int j=1 ; j<=(i*2)-1 ; j++) {
					if(j == 1 || j == (i*2)-1) {
						sb.append("*");
					}else {
						sb.append(" ");
					}
				}
			} else {
				for(int j=1 ; j<=(i*2)-1 ; j++) {
					sb.append("*");
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
