package programmers.level1;

import java.util.Arrays;

public class GcdAndLcm {

	//level 1
	//���α׷��ӽ� ���� : �ִ������� �ּҰ����
	public static void main(String[] args) {
		
		int n = 3;
		int m = 12;
		int[] arr = new int[2];
		int gcd = gcd(n,m);
		arr[0] = gcd;
		arr[1] = (n*m)/gcd;
		
		System.out.println(Arrays.toString(arr));
	}
	
	//��Ŭ���� ȣ����
	//��� ���
	public static int gcd(int n, int m) {
		
		if(m == 0) {
			return n;
		} else {
			return gcd(m, n%m);
		}
	}
	
	//�ݺ��� ���
	public static int gcd2(int n, int m) {
		
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		while(m > 0) {
			int a = n%m;
			n = m;
			m = a;
		}
		
		return n;
	}
}
