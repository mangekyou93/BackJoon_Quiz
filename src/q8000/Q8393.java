package q8000;

import java.util.Scanner;

public class Q8393 {
	
	//�Է�
	//ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.			<<<<<<<<		"�ִ� 10,000�� ��ó ������ �ϰڱ���"
	
	//���
	//1���� n���� ���� ����Ѵ�.
	
	//���� ���� 8393 : ��
	public static void main(String[] args) {
		
		int n = 0;
		long result = 0;								// int�� �ص� ������� 21���� �ȳѾ
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
//		for(int i=1 ; i<=n ; i++) {
//			result += i;
//		}
		
		result = n*(n+1) / 2;
		
		System.out.println(result);
	}
}
