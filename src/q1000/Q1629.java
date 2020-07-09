package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629 {

	//백준 문제 1629 : 곱셈
	//BigInteger는 런타임 에러 나온다. (아마도 숫자가 너무 커서 그런거 같음)
	
	//★★★★★★★★★★★★★★★★ 정수론 ★★★★★★★★★★★★★★★★
	//4 ≡ 7 (mod 3)
	//A를 C로 나눴을 때 몫을 QA , 나머지를 RA라 하고,
	//B를 C로 나눴을 때 몫을 QB , 나머지를 RB라 하면,
	//A = C*QA + RA
	//B = C*QB + RB
	//A*B = (C*QA + RA) * (C*QB + RB)
	//    = C^2QAQB + C(QA*RB + QB*RA) + RA*RB 이고,
	//A*B/C = CQAQB + (QA*RB + QB*RA) + (RA*RB)/C
	
	//결국 나머지만 생각한다면, RA*RB / C로 나누는 것과 같다. 
	//(A*B)%C = ((A%C)*(B%C))%C
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	
	//2147483647 = 2^31번을 for문을 돌리는 것보다
	//log2^31 = 31이므로
	//시간이 훨씬 줄어든다.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A, B, C));
	}
	
	//분할 정복
	public static long pow(long a, long b, long c) {
		if(b == 0) return 1;
		long n = pow(a, b/2, c);
		long tmp = (n * n) % c;
		
		if(b % 2 == 0) {
			return tmp % c;
		} else {
			return (a * tmp) % c;
		}
	}
	
}
