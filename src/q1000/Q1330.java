package q1000;

import java.util.Scanner;

public class Q1330 {

	//백준 문제 1330 : 두 수 비교하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a > b ? ">" : a == b ? "==" : "<");
	}
}
