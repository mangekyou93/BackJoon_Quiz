package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10870 {

	//백준 문제 10870 : 피보나치 수 5
	//10872 팩토리얼도 런타임
	//이것도 런타임...
	public static void main(String[] args) throws Exception{
		
		//fn = fn-1 + fn-2 (단, n>=2)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
		
		br.close();
	}
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
