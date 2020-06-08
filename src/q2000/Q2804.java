package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2804 {

	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//해로운 문제임 풀지마 ㅅㅂ
	//문제 병신같음ㅋㅋㅋ
	//print랑 이런거 다 똑같은데 시발ㅋㅋㅋㅋ
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//백준 문제 2804 : 크로스워드 만들기
	//분류 : 반복문
	//문제에서 N < M 조건도 없음
	//AAAAAAAB BEST 안됨
	static int n,m;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken().toUpperCase();
		String B = st.nextToken().toUpperCase();
		
		boolean check = false;
		
		for(int i=0 ; i<B.length() ; i++) {
			for(int j=0 ; j<A.length() ; j++) {
				if(A.charAt(j) == B.charAt(i)) {
					n = j;
					m = i;
					check = true;
					break;
				}
			}
			
			if(check) break;
		}
		
		for(int i=0 ; i<B.length() ; i++) {
			
			if(i == m) {
				sb.append(A).append("\n");
				continue;
			}
			
			for(int j=0 ; j<B.length() ; j++) {
				
				if(j == n) {
					sb.append(B.charAt(i));
				} else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
}
