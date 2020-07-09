package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2547 {

	//백준 문제 2547 : 사탕 선생 고창영
	//정수론 + long 타입 인듯?
	//나머지를 더한 값의 나머지가 일치하는지 보는 문제
	//메모리 : 19MB / 시간 : 0.148 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			br.readLine();
			int N = Integer.parseInt(br.readLine());
			long sum = 0;
			for(int i=0 ; i<N ; i++) {
				sum += Long.parseLong(br.readLine()) % N;
			}
			
			if(sum % N == 0) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		System.out.println(sb);
		
	}
	
}
