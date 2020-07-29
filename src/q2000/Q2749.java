package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2749 {

	//백준 문제 2749 : 피보나치 수 3
	//메모리 : 25MB / 시간 : 0.116 s
	
	//피보나치 수의 속성을 알아야지 풀 수 있는 문제...
	//피보나치의 속성
	//1. 피사노 주기 : 피보나치 수를 K로 나눈 나머지는 항상 주기를 가진다. (피보나치 수를 3으로 나누었을 때, 주기의 길이는 8)
	//2. 주기의 길이가 P이면, N번째 피보나치 수를 M으로 나눈 나머지는 N%P번째 피보나치 수를 M을 나눈 나머지와 같다. (1000%8 = 0번째 피보나치 수를 M으로 나눈 나머지와 같다.)
	//3. M = 10^k일 때, k > 2라면, 주기는 항상 15 * 10^(k-1)이다.
	
	//d가 1000000이므로 10^6 -> 주기는 항상 15 * 10^5 = 1500000	:: 피보나치의 속성 3
	static int d = 1000000;
	static long[] fibo = new long[1500000];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2 ; i<1500000 ; i++) {
			fibo[i] = (fibo[i-1] + fibo[i-2]) % d;
		}
		
		if(n >= 1500000) {
			n %= 1500000;
		}
		
		System.out.println(fibo[(int)n]);
		
	}
}
