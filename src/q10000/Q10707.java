package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10707 {

	//백준 문제 10707 : 수도요금
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		
		int X = A*P;
		int Y = P <= C ? B : (P-C)*D + B;
		
		System.out.println(Math.min(X, Y));
		
	}
}
