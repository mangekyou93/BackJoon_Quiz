package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11401 {

	//백준 문제 11401 : 이항 계수 3
	//메모리 : 14MB / 시간 : 0.204 s
	//확실히 분할정복이라 시간이 log로 줄어서 그런지 적게 나옴.
	
	// 구글 드라이브에 정리 해 놓았음
	// nCr에서
	// A = n!, B = k!(n-r)! 이라고 한다면, A / B (mod M)을 구하는 것
	// M(=1000000007)이 소수이기 때문에, 페르마의 소정리를 사용할 수 있다.
	// A * B^(M-2) (mod M)이 된다.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int d = 1000000007;
		
		long t1 = 1;
		long t2 = 1;
		
		for(int i=1 ; i<=N ; i++) {
			t1 *= i;
			t1 %= d;
		}
		for(int i=1 ; i<=K ; i++) {
			t2 *= i;
			t2 %= d;
		}
		for(int i=1 ; i<=N-K ; i++) {
			t2 *= i;
			t2 %= d;
		}
		
		long t3 = mul(t2, d-2, d);
		t3 %= d;
		long answer = t1 * t3;
		answer %= d;
		System.out.println(answer);
	}
	
	public static long mul(long x, long y, long p) {
		long answer = 1;
		while(y > 0) {
			if(y%2 != 0) {
				answer *= x;
				answer %= p;
			}
			x *= x;
			x %= p;
			y /= 2;
		}
		
		return answer;
	}
}
