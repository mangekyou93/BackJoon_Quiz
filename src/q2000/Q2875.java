package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2875 {

	//백준 문제 2875 : 대회 or 인턴
	//분류 : 그리디 알고리즘
	
	//풀었다..
	//진짜 하면 할 수 있을꺼야!!!!!
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());			//여학생의 수
		int M = Integer.parseInt(st.nextToken());			//남학생의 수
		int K = Integer.parseInt(st.nextToken());			//인턴쉽에 참여해야할 학생의 수
		
		while(K > 0) {
			if(N >= M*2) {
				N--;
				K--;
			} else {
				M--;
				K--;
			}
		}
		
		int count = 0;
		while(M > 0 && N > 1) {
			N -= 2;
			M--;
			count++;
		}
		
		System.out.println(count);
		
	}
	
}
