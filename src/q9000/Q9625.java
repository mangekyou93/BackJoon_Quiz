package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9625 {

	//백준 문제  9625 : BABBA
	//분류 : 반복문
	//해보니까 피보나치 수열임
	//이걸 재귀로 풀 것인가 그냥 반복문으로 풀 것인가
	//둘 다 풀어보자
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		//반복문
		repeat(k);
		
		//재귀
		//틀렸다고 나옴
		//int a = recursion(k-1);
		//int b = recursion(k);
		//System.out.println(a+" "+b);
	}
	
	
	public static int recursion(int k) {
		if(k == 0) return 0;
		if(k == 1) return 1;
		
		return recursion(k-1)+recursion(k-2);
	}
	
	//반복문
	public static void repeat(int k) {
		if(k == 1) {
			sb.append("0 1");
			return ;
		}
		
		int[] arr = new int[45];
		arr[0] = 1;
		arr[1] = 1;
		
		//for(int i=2 ; i<=k ; i++) {		//  i <= k 까지 하면 런타임 에러....
		for(int i=2 ; i<k ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		sb.append(arr[k-2]+" "+arr[k-1]);
	}

}
