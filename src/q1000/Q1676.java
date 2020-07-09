package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1676 {

	//백준 문제 1676 : 팩토리얼 0의 개수
	//BigInteger(o) = 메모리 : 14MB / 시간 : 0.092 s
	//BigInteger(x) = 메모리 : 13MB / 시간 : 0.076 s
	//BigInteger를 사용해서 구현해도
	//엄청나게 크게 차이나진 않는다.
	//일단 끝에 0의 개수는 2와 5의 개수 중 적은 것
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		zeroCount(n);
		BigInteger bi = new BigInteger("1");
			
		for(int i=1 ; i<=n ; i++) {
			bi = bi.multiply(new BigInteger(i+""));
		}
		
		String s = bi.toString();
		int count = 0;
		for(int i=s.length()-1 ; i>=0 ; i--) {
			if(s.charAt(i) == '0') {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
	
	//BigInteger 없이 구현
	public static void zeroCount(int n) {
		int two = 0;
		int five = 0;
		
		for(int i=2 ; i<=n ; i*=2) {		// 이거 너무 신기함... 2로 나누고 4로 나누고 8로 나누어서 2의 개수를 구함...
			two += n/i;						// 왜 이렇게 되는지 이해가 안됨.
		}
		for(int i=5 ; i<=n ; i*=5) {
			five += n/i;
		}
		
		System.out.println(five < two ? five : two);
	}
}
