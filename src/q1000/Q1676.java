package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1676 {

	//���� ���� 1676 : ���丮�� 0�� ����
	//BigInteger(o) = �޸� : 14MB / �ð� : 0.092 s
	//BigInteger(x) = �޸� : 13MB / �ð� : 0.076 s
	//BigInteger�� ����ؼ� �����ص�
	//��û���� ũ�� ���̳��� �ʴ´�.
	//�ϴ� ���� 0�� ������ 2�� 5�� ���� �� ���� ��
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		zeroCount(n);
		BigInteger bi = new BigInteger("1");
			
		for(int i=1 ; i<=n ; i++) {
			bi = bi.multiply(new BigInteger(i+""));
		}
		
		String s = bi.toString();
		int count = 0;
		for(int i=s.length()-1 ; i>=0 ; i--) {
			if(s.charAt(i) == '0') {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
	
	//BigInteger ���� ����
	public static void zeroCount(int n) {
		int two = 0;
		int five = 0;
		
		for(int i=2 ; i<=n ; i*=2) {		// �̰� �ʹ� �ű���... 2�� ������ 4�� ������ 8�� ����� 2�� ������ ����...
			two += n/i;						// �� �̷��� �Ǵ��� ���ذ� �ȵ�.
		}
		for(int i=5 ; i<=n ; i*=5) {
			five += n/i;
		}
		
		System.out.println(five < two ? five : two);
	}
}
