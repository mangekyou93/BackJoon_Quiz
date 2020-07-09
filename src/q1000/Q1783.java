package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1783 {

	//백준 문제 1783 : 병든 나이트
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//N == 1 or M == 1 이면, 무조건 1
		if(N == 1 || M == 1) {
			System.out.println(1);
		} else if(N == 2) {
			if(M <= 2) {
				System.out.println(1);
			} else if(M <= 4) {
				System.out.println(2);
			} else if(M <= 6) {
				System.out.println(3);
			} else {
				System.out.println(4);
			}
		} else if(N > 2) {
			if(M < 5) {
				System.out.println(M);
			} else if(M == 5 || M == 6) {
				System.out.println(4);
			} else {
				System.out.println(M-2);
			}
		}
	}
}
