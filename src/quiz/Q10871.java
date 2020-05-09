package quiz;

import java.util.Scanner;

public class Q10871 {
	
	//입력
	//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
	//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

	//출력
	//X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
	
	public static void main(String[] args) {
		
		/*
		// O(N)의 시간복잡도 , 공간복잡도 역시 N개의 값을 저장해야 하므로 O(N)이 됩니다.
		
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
		
		// 이 경우 공간복잡도는 O(1)
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
