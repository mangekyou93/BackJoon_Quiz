package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2503 {

	//백준 문제 2503 : 숫자 야구
	//분류 : 브루트 포스
	static boolean[] baseball = new boolean[1000];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<111 ; i++) {
			baseball[i] = true;
		}
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String q = st.nextToken();
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(s == 0 && b == 0) {
				for(int i=111 ; i<baseball.length ; i++) {
					String text = String.valueOf(i);
					
					if(text.contains(String.valueOf(q.charAt(0))) || text.contains(String.valueOf(q.charAt(1))) || text.contains(String.valueOf(q.charAt(2)))) {
						
					}
				}
			} else {
				
			}
		}
		
	}
}
