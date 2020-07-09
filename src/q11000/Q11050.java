package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050 {

	//백준 문제 11050 : 이항 계수 1
	static int[] factorial = new int[11];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		getFactorial();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//이항계수 : aCb 이거 말하는거 같음
		//a == 5, b == 2
		//5! / ((5-2)! * 2!)
		//5*4 / 2 = 10
		
		System.out.println(factorial[a] / (factorial[a-b] * factorial[b]));
	}
	
	public static void getFactorial() {
		factorial[0] = 1;
		factorial[1] = 1;
		for(int i=2 ; i<=10 ; i++) {
			factorial[i] = factorial[i-1] * i;
		}
	}
	
}
