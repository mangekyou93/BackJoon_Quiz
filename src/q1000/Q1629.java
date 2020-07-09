package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1629 {

	//���� ���� 1629 : ����
	//BigInteger�� ��Ÿ�� ���� ���´�. (�Ƹ��� ���ڰ� �ʹ� Ŀ�� �׷��� ����)
	
	//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� ������ �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	//4 �� 7 (mod 3)
	//A�� C�� ������ �� ���� QA , �������� RA�� �ϰ�,
	//B�� C�� ������ �� ���� QB , �������� RB�� �ϸ�,
	//A = C*QA + RA
	//B = C*QB + RB
	//A*B = (C*QA + RA) * (C*QB + RB)
	//    = C^2QAQB + C(QA*RB + QB*RA) + RA*RB �̰�,
	//A*B/C = CQAQB + (QA*RB + QB*RA) + (RA*RB)/C
	
	//�ᱹ �������� �����Ѵٸ�, RA*RB / C�� ������ �Ͱ� ����. 
	//(A*B)%C = ((A%C)*(B%C))%C
	//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	
	//2147483647 = 2^31���� for���� ������ �ͺ���
	//log2^31 = 31�̹Ƿ�
	//�ð��� �ξ� �پ���.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A, B, C));
	}
	
	//���� ����
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
