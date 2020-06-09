package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1188 {
	
	//백준 문제 1188 : 음식 평론가
	//분류 : 반복문
	//최대공약수 문제
	//최대공약수(GCD, Greatest Common Divisor)
	//최소공배수(LCM, Least Common Multiple)
	//서로소 : 공약수가 1밖에 없는 것을 뜻함.
	//ex) 2와 4는 공약수가 1,2가 있으므로 서로소가 아니다.
	//그러나 2 3은 공약수가 1밖에 없으므로 서로소이다.
	
	//최대공약수를 구하는 방법을 배웠다.
	//근데 어떻게 이런 패턴을 보고 한번에 최대공약수로 문제 푸는건지를 알 수 있을까...
	//여러 시뮬레이션을 해봐야되나
	//이런건 아무리 문제 많이 풀어도 감이 안올꺼같은데..
	//수학적인 센스가 필요할 것 같은데..
	public static void main(String[] args) throws Exception {
		
		//1 -> 1 : 0	1 - 최대공약수(1) = 0
		//1 -> 2 : 1	2 - 최대공약수(1) = 1
		//2 -> 2 : 0	2 - 최대공약수(2) = 0
		//2 -> 6 : 4	
		//3 -> 5 : 4	
		//3 -> 6 : 3	6 - 최대공약수(3) = 3
		//3 -> 9 : 6	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());		//소세지의 수
		int m = Integer.parseInt(st.nextToken());		//평론가의 수
		
		int gcd = gcd_2(n,m);

		System.out.println(m - gcd);
	}
	
	//시간복잡도 O(N)
	static void gcd_1(int n, int m) {
		int a = 1;
		for(int i=2 ; i <= Math.min(n,m) ; i++) {
			
			if(n % i == 0 && m % i == 0) {
				a = i;
			}
		}
	}
	
	//유클리드 호제법
	//가장 효율적임
	//재귀
	static int gcd_2(int n, int m) {
		//최솟값을 걱정할 필요가 없는게
		//계산하는 도중에 m과 n이 변경된다.
		if(m == 0) {
			return n;
		} else {
			return gcd_2(m, n%m);
		}
	}

}
