package q1000;

import java.util.Arrays;
import java.util.Scanner;

public class Q1912 {

	//완전 탐색(Brute-force Search, 브루트포스)
	//절대 틀릴 일은 없는 강력한 방식이지만, 당연히 시간은 최대로 들어갑니다.
	
	//문제
	//n개의 정수로 이루어진 임의의 수열이 주어진다. 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.
	//예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자. 여기서 정답은 12+21인 33이 정답이 된다.
	
	//입력
	//첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 
	//둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다. 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

	//출력
	//첫째 줄에 답을 출력한다.
	
	public static void main(String[] args) {
		
		/*
		//시간복잡도 이중 for문 == O(n^2)
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
