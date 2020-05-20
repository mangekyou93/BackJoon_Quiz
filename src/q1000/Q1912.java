package q1000;

import java.util.Arrays;
import java.util.Scanner;

public class Q1912 {

	//���� Ž��(Brute-force Search, ���Ʈ����)
	//���� Ʋ�� ���� ���� ������ ���������, �翬�� �ð��� �ִ�� ���ϴ�.
	
	//����
	//n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
	//���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
	
	//�Է�
	//ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� 
	//��° �ٿ��� n���� ������ �̷���� ������ �־�����. ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.

	//���
	//ù° �ٿ� ���� ����Ѵ�.
	
	public static void main(String[] args) {
		
		/*
		//�ð����⵵ ���� for�� == O(n^2)
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				if(i!=j) {
					result = Math.max(result, a[i]+a[j]);
				}
			}
		}
		
		System.out.println(result);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
	}
	

}
