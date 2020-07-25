package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11401 {

	//���� ���� 11401 : ���� ��� 3
	//�޸� : 14MB / �ð� : 0.204 s
	//Ȯ���� ���������̶� �ð��� log�� �پ �׷��� ���� ����.
	
	// ���� ����̺꿡 ���� �� ������
	// nCr����
	// A = n!, B = k!(n-r)! �̶�� �Ѵٸ�, A / B (mod M)�� ���ϴ� ��
	// M(=1000000007)�� �Ҽ��̱� ������, �丣���� �������� ����� �� �ִ�.
	// A * B^(M-2) (mod M)�� �ȴ�.
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
