package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1789 {
	
	//���� ���� 1789 : ������ ��
	//�з� : ����, ����
	
	//��ճ� �̰�
	//100�̸� 1 ~ 13���� ���ϸ� 91�̰� 100 - 91 �ϸ� 9�ϱ�
	//9�� �̹� ��������Ƿ�
	//1 ~ 12���� �����ְ�, 9+13�� �����ش�. 
	//�װ� ���� ���� ����Ƚ���� ���´�.
	
	//N�� ���� �ٸ� ���� ������ �ǹ��ϴϱ�
	//����Ƚ���� ������ ���ƾ���
	//�� ���� ���� ���� �ͺ��� ���ʴ�� ���ذ��� ��
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		long S = Long.parseLong(br.readLine());
		
		for(long i=1 ; S>0 ; i++) {
			S -= i;
			count++;
		}
		
		if(S < 0) {
			System.out.println(count-1);
		} else {
			System.out.println(count);
		}
	}
}
