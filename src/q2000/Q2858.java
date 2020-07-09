package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2858 {

	//백준 문제 2858 : 기숙사 바닥
	//분류 : 브루트 포스
	
	//수학적인 규칙을 찾아야하는데 잘 못찾네...
	//많이 연습해야함.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int L = 0;
		int W = 0;
		
		int sum = R + B;
		
		//sum == L * W == R + B;
		
		for(int i=1 ; i<R ; i++) {
			for(int j=1 ; j<R ; j++) {
				if(i * 2 + ((j - 2) * 2) == R && (i - 2) * (j - 2) == B) {
					L = i;
					W = j;
				}
			}
		}
		
		System.out.println(L+" "+W);
		
	}
}
