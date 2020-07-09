package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004 {

	//백준 문제 2004 : 조합 0의 개수
	
	//n, m이 2000000000(20억)보다 작거나 같아서
	//BigInteger는 메모리 초과..
	
	//문제 1676 : 팩토리얼 0의 개수에서 이항 계수로만 바꾼 문제
	//소인수 분해해서 2와 5의 갯수중 작은 것이 뒤에 0이 몇개 붙었는지 알 수 있다.
	static int two = 0, five = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//nCm이면
		//n! / ((n-m)! * m!)이므로,
		
		//n!
		two = zeroCount(n, 2);
		five = zeroCount(n, 5);

		//m!
		two -= zeroCount(m, 2);
		five -= zeroCount(m, 5);

		//(n-m)!
		two -= zeroCount(n-m, 2);
		five -= zeroCount(n-m, 5);
		
		System.out.println(two < five ? two : five);
	}
	
	public static int zeroCount(int a, long d) {
		int cnt = 0;
		long multiple = d;
		while(a >= d) {
			cnt += a/d;
			d *= multiple;
		}
		
		return cnt;
	}
	
}
