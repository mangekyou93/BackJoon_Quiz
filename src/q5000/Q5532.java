package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5532 {
	
	//백준 문제 5532 : 방학 숙제
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		while(true) {
			L--;
			A -= C;
			B -= D;
			if(A <= 0 && B <= 0) {
				System.out.println(L);
				break;
			}
		}
	}
}
