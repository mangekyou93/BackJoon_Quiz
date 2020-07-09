package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1094 {

	//백준 문제 1094 : 막대기
	//분류 : 수학
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		String s = Integer.toString(X, 2);
		
		int count = 0;
		for(int i=0 ; i<s.length() ; i++) {
			if((int)(s.charAt(i) - '0') == 1) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
