package q2000;

import java.util.Scanner;

public class Q2588 {

	//���� ���� 2588 : ����
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		int c = b / 100;				//���� �ڸ�
//		int d = (b - (c*100)) / 10;		//���� �ڸ�
//		int e = b-(c*100)-(d*10);		//���� �ڸ�
//		
//		System.out.println(a*e);
//		System.out.println(a*d);
//		System.out.println(a*c);
//		System.out.println(a*b);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (b % 100) % 10;			//���� �ڸ�
		int d = 5;
		int e = b % 100;				//���� �ڸ�
	}
}
