package q1000;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
	
	//백준 문제 1912 : 연속합
	//분류 : 다이나믹 프로그래밍
	//메모리 : 24MB / 시간 : 0.184 s
	
	//첫 번째는 시간 초과가 나옴
	//1 <= N <= 100,000
	//O(N^2)이라서 1초를 넘어가나 봄
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//다이나믹 프로그래밍의 예시...
		//사실 이 연속합은 완전탐색으로 하기에는 O(N^2)이라서 시간이 부족하고,
		//다이나믹 프로그래밍으로 푸는 것이 O(N)이 나와서 1초 미만으로 나온다.
		int[] dp = new int[n];
		dp[0] = arr[0];
		int max = arr[0];
		for(int i=1 ; i<n ; i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
		/*
		//옛날 소스(실패)
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
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		*/
	}
	

}
