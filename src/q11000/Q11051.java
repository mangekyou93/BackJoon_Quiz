package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q11051 {

	//백준 문제 11051 : 이항 계수 2
	static int[][] dp = new int[1001][1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(pascal(a,b));
		
		/*
		//BigInteger는 숫자가 기하급수적으로 커지면 메모리 초과가 많이 발생할 듯
		BigInteger bi = new BigInteger("1");
		BigInteger bi2 = new BigInteger("1");
		
		
		if(a == b) {
			System.out.println(1);
		}else {
			for(int i=a ; i>b ; i--) {
				bi = bi.multiply(new BigInteger(i+""));
			}
			
			for(int i=1 ; i<=a-b ; i++) {
				bi2 = bi2.multiply(new BigInteger(i+""));
			}
			bi = bi.divide(bi2);
			bi = bi.remainder(new BigInteger("10007"));
			
			System.out.println(bi);
		}
		*/
	}
	
	//파스칼의 삼각형을 이용해서 풀 수도 있다.
	//dp 개념
	//5C2 = 4C1 + 4C2를 구해서 더하면 된다.
	//4C1 = 3C0 + 3C1, 4C2 = 3C1 + 3C2
	//이런식으로 작게 분할해서 풀면 됨.
	public static int pascal(int a, int b) {
		if(a == b || b == 0) return 1;
		if(dp[a][b] > 0) return dp[a][b];
		
		//5C2    =       4C1        +      4C2
		dp[a][b] = pascal(a-1, b-1) + pascal(a-1, b);			//이게 점화식, 점화식을 구하는 과정이 다이나믹프로그래밍에서 정말 중요함.
		
		return dp[a][b]%10007;
	}
}
