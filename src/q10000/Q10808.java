package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10808 {

	//백준 문제 10808 : 알파벳 개수
	//분류 : 문자열 처리
	static int[] alpabet = new int[26];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			alpabet[s.charAt(i) - 'a']++;
		}
		
		for(int i=0 ; i<alpabet.length ; i++) {
			sb.append(alpabet[i]).append(" ");
		}
		
		System.out.println(sb);
	}
	
}
