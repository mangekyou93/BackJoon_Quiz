package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004 {

	//���� ���� 2004 : ���� 0�� ����
	
	//n, m�� 2000000000(20��)���� �۰ų� ���Ƽ�
	//BigInteger�� �޸� �ʰ�..
	
	//���� 1676 : ���丮�� 0�� �������� ���� ����θ� �ٲ� ����
	//���μ� �����ؼ� 2�� 5�� ������ ���� ���� �ڿ� 0�� � �پ����� �� �� �ִ�.
	static int two = 0, five = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//nCm�̸�
		//n! / ((n-m)! * m!)�̹Ƿ�,
		
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
