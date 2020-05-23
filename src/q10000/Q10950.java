package q10000;

import java.util.Scanner;

public class Q10950 {

	//백준 문제 10950 : A+B - 3
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
		//////// 출력도 한번에 해야하는 줄 알고 for문을 2번 돌림 근데 상관 없이 그냥 바로 출력해도 괜찮음 /////////////////
		//////////////////////////////////////////////////////////////////////////////////////
		
		//이게 정답임
		for(int i=0 ; i<t ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
