package q1000;

import java.util.Scanner;

public class Q1008 {
	
	//백준 문제 1008: A / B
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int a = sc.nextInt();			
		//int b = sc.nextInt();			
		
		double a = sc.nextDouble();		//double로 하는 이유 : 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
		double b = sc.nextDouble();
		
		System.out.println(a/b);
	}
}
