package q10000;

import java.util.Scanner;

public class Q10950 {

	//���� ���� 10950 : A+B - 3
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i=0 ; i<t ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a+b;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			
			System.out.println(arr[i]);
		}
		
		//////////////////////////////////////////////////////////////////////////////////////
		//////// ��µ� �ѹ��� �ؾ��ϴ� �� �˰� for���� 2�� ���� �ٵ� ��� ���� �׳� �ٷ� ����ص� ������ /////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		
		//�̰� ������
		for(int i=0 ; i<t ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
