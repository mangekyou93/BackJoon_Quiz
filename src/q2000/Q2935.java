package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q2935 {

	//백준 문제 2935 : 소음
	//분류 : 구현
	//int, long은 구현해낼 수 없다.
	//따라서 BigInteger를 사용
	//BigInteger는 자바만 사용할 수 있는 내장 함수
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger A = new BigInteger(br.readLine());
		String oper = br.readLine();
		BigInteger B = new BigInteger(br.readLine());
		switch(oper) {
			case "*":
				System.out.println(A.multiply(B));
				break;
			default :
				System.out.println(A.add(B));
				break;
		}
	}
}
