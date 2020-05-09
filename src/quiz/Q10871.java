package quiz;

import java.util.Scanner;

public class Q10871 {
	
	//�Է�
	//ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
	//��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

	//���
	//X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
	
	public static void main(String[] args) {
		
		/*
		// O(N)�� �ð����⵵ , �������⵵ ���� N���� ���� �����ؾ� �ϹǷ� O(N)�� �˴ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int n,x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++) {
			if(a[i] < x) {
				answer += a[i]+" ";
			}
		}
		
		System.out.println(answer);
		*/
		
		// �� ��� �������⵵�� O(1)
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int n,x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			int a = sc.nextInt();
			if(a < x) {
				answer += a+" ";
			}
		}
		
		System.out.println(answer);
		
	}
}
