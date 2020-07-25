package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2749 {

	//백준 문제 2749 : 피보나치 수 3
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		System.out.println(fibonacci(n));
		
	}
	
	public static long fibonacci(long n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
