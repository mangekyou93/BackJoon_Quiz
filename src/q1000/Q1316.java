package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1316 {

	//백준 문제 1316 : 그룹 단어 체커
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = n;
		
		for(int i=0 ; i<n ; i++) {
			String s = br.readLine().trim();
			boolean[] checker = new boolean[26];
			
			for(int j=1 ; j<s.length() ; j++) {
				
				if(s.charAt(j-1) != s.charAt(j)) {
					
					if(checker[s.charAt(j)-'a'] == true) {
						answer--;
						break;
					}
					
					checker[s.charAt(j-1) - 'a'] = true;
				}
			}
		}
		
		System.out.println(answer);
	}
}
