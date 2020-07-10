package q8000;

import java.util.Scanner;

public class Q8393 {
	
	//입력
	//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.			<<<<<<<<		"최대 10,000번 근처 연산을 하겠구나"
	
	//출력
	//1부터 n까지 합을 출력한다.
	
	//백준 문제 8393 : 합
	public static void main(String[] args) {
		
		int n = 0;
		long result = 0;								// int로 해도 상관업음 21억이 안넘어감
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
//		for(int i=1 ; i<=n ; i++) {
//			result += i;
//		}
		
		result = n*(n+1) / 2;
		
		System.out.println(result);
	}
}
