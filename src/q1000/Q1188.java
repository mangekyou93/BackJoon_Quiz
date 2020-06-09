package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1188 {
	
	//���� ���� 1188 : ���� ��а�
	//�з� : �ݺ���
	//�ִ����� ����
	//�ִ�����(GCD, Greatest Common Divisor)
	//�ּҰ����(LCM, Least Common Multiple)
	//���μ� : ������� 1�ۿ� ���� ���� ����.
	//ex) 2�� 4�� ������� 1,2�� �����Ƿ� ���μҰ� �ƴϴ�.
	//�׷��� 2 3�� ������� 1�ۿ� �����Ƿ� ���μ��̴�.
	
	//�ִ������� ���ϴ� ����� �����.
	//�ٵ� ��� �̷� ������ ���� �ѹ��� �ִ������� ���� Ǫ�°����� �� �� ������...
	//���� �ùķ��̼��� �غ��ߵǳ�
	//�̷��� �ƹ��� ���� ���� Ǯ� ���� �ȿò�������..
	//�������� ������ �ʿ��� �� ������..
	public static void main(String[] args) throws Exception {
		
		//1 -> 1 : 0	1 - �ִ�����(1) = 0
		//1 -> 2 : 1	2 - �ִ�����(1) = 1
		//2 -> 2 : 0	2 - �ִ�����(2) = 0
		//2 -> 6 : 4	
		//3 -> 5 : 4	
		//3 -> 6 : 3	6 - �ִ�����(3) = 3
		//3 -> 9 : 6	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());		//�Ҽ����� ��
		int m = Integer.parseInt(st.nextToken());		//��а��� ��
		
		int gcd = gcd_2(n,m);

		System.out.println(m - gcd);
	}
	
	//�ð����⵵ O(N)
	static void gcd_1(int n, int m) {
		int a = 1;
		for(int i=2 ; i <= Math.min(n,m) ; i++) {
			
			if(n % i == 0 && m % i == 0) {
				a = i;
			}
		}
	}
	
	//��Ŭ���� ȣ����
	//���� ȿ������
	//���
	static int gcd_2(int n, int m) {
		//�ּڰ��� ������ �ʿ䰡 ���°�
		//����ϴ� ���߿� m�� n�� ����ȴ�.
		if(m == 0) {
			return n;
		} else {
			return gcd_2(m, n%m);
		}
	}

}
