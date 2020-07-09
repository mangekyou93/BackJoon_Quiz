package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5598 {

	//백준 문제 5598 : 카이사르 암호
	//분류 : 문자열 처리
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String caesar = br.readLine();
		
		for(int i=0 ; i<caesar.length() ; i++) {
			if(caesar.charAt(i) == 'A' || caesar.charAt(i) == 'B' || caesar.charAt(i) == 'C') {
				sb.append((char)(caesar.charAt(i) - 'A' + 'X'));
			}else {
				sb.append((char)(caesar.charAt(i) - 3));
			}
		}
		
		System.out.println(sb);
	}
	
}
