package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5622 {
	
	//백준 문제 5622 : 다이얼
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int sum = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			sum += (s.charAt(i) - 'A')/3+3;
			if(s.charAt(i) == 'S' || s.charAt(i) == 'V' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') {
				sum--;
			}
		}
		
		System.out.println(sum);
	}
}
