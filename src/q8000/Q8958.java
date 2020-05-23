package q8000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8958 {

	//백준 문제 8958 : OX퀴즈
	//메모리 13MB / 시간 0.08s
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			String text = br.readLine();
			int score = 0;
			int max = 0;
			
			for(int j=0 ; j<text.length() ; j++) {
				if(text.charAt(j) == 'O') {
					score++;
					max += score;
				} else {
					score = 0;
				}
			}
			
			sb.append(max+"\n");
		}
		
		System.out.println(sb);
	}
}
