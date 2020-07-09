package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q6679 {

	//백준 문제 6679 : 싱기한 네자리 숫자
	//분류 : 브루트 포스
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int n=1000 ; n<10000 ; n++) {
			String ten = Integer.toString(n, 10);
			String twe = Integer.toString(n, 12);
			String six = Integer.toString(n, 16);
			int a = 0;
			int b = 0;
			int c = 0;
			
			for(int i=0 ; i<ten.length() ; i++) {
				a += ten.charAt(i) - '0';
			}
			
			for(int i=0 ; i<twe.length() ; i++) {
				char ch = twe.charAt(i);
				
				switch (ch) {
				case 'a' :
					b += 10;
					break;
				case 'b' : 
					b += 11;
					break;
				case 'c' :
					b += 12;
					break;
				default : 
					b += ch - '0';
					break;
				}
			}
			
			for(int i=0 ; i<six.length() ; i++) {
				char ch = six.charAt(i);
				switch (ch) {
				case 'a' :
					c += 10;
					break;
				case 'b' : 
					c += 11;
					break;
				case 'c' :
					c += 12;
					break;
				case 'd' :
					c += 13;
					break;
				case 'e' :
					c += 14;
					break;
				case 'f' :
					c += 15;
					break;
				default :
					c += ch - '0';
					break;
				}
			}
			if(a == b && a == c) {
				sb.append(n).append("\n");
			}
		}
		
		
		System.out.println(sb);
	}
}
