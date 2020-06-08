package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2789 {

	//백준 문제  2789 : 유학 금지
	//분류 : 반복문
	//메모리 : 13MB / 시간 : 0.072 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String text = "CAMBRIDGE";
		boolean[] check = new boolean[26];
		
		for(int i=0 ; i<text.length() ; i++) {
			check[text.charAt(i) - 'A'] = true;
		}
		
		String s = br.readLine().toUpperCase();
		
		for(int i=0 ; i<s.length() ; i++) {
			
			if(!check[s.charAt(i) - 'A']) {
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb);
	}

}
