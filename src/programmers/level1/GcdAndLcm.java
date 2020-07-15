package programmers.level1;

import java.util.Arrays;

public class GcdAndLcm {

	//level 1
	//프로그래머스 문제 : 최대공약수와 최소공배수
	public static void main(String[] args) {
		
		int n = 3;
		int m = 12;
		int[] arr = new int[2];
		int gcd = gcd(n,m);
		arr[0] = gcd;
		arr[1] = (n*m)/gcd;
		
		System.out.println(Arrays.toString(arr));
	}
	
	//유클리드 호제법
	//재귀 방식
	public static int gcd(int n, int m) {
		
		if(m == 0) {
			return n;
		} else {
			return gcd(m, n%m);
		}
	}
	
	//반복문 방식
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
