package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1748 {
	
	//���� ���� 1748 : �� �̾� ���� 1
	//�з� : ����
	//�� ������ String , String.length()�� ���ϸ� �޸� �ʰ��� ���´�.
	//���� ���� �ڸ����� �ϴ°� ������.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int a = n;
		int count = 0;
		int len = 0;
		
		//n == 1000 -> 9*1 + 90*2 + 900*3 + 1*4 = 9 + 180 + 2700 + 4 = 2893
		//			-> 9*10^0*1 + 9*10^1*2 + 
		//n == 120 -> 9*1 + 90*2 + (120 - 100 + 1)*3 = 9 + 180 + 63 = 252
		while(n > 0) {
			n /= 10;
			count++;
		}
		
		for(int i=1 ; i<count ; i++) {
			len += 9 * Math.pow(10, i-1) * i;
		}
		
		a = a - ((int)Math.pow(10, count-1)) + 1;
		len+=(a*count);
		
		System.out.println(len);
	}
}
