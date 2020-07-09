package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q2935 {

	//���� ���� 2935 : ����
	//�з� : ����
	//int, long�� �����س� �� ����.
	//���� BigInteger�� ���
	//BigInteger�� �ڹٸ� ����� �� �ִ� ���� �Լ�
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger A = new BigInteger(br.readLine());
		String oper = br.readLine();
		BigInteger B = new BigInteger(br.readLine());
		switch(oper) {
			case "*":
				System.out.println(A.multiply(B));
				break;
			default :
				System.out.println(A.add(B));
				break;
		}
	}
}
