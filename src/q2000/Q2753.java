package q2000;

import java.util.Scanner;

public class Q2753 {

	//백준 문제 2753 : 윤년
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
