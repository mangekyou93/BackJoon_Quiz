package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1592 {
	
	//백준 문제 1592 : 영식이와 친구들
	//분류 : 유클리드 호제법
	public static void main(String[] args) throws Exception{
		
		//3 1 1 : 0번
		//3 2 1 : 3번
		//3 3 1 : 6번
		//3 4 1 : 9번
		
		//3 1 2 : 0번
		//3 2 2 : 3번
		//3 3 2 : 6번
		//3 4 2 : 9번
		
		//4 1 1 : 0번
		//4 2 1 : 4번
		//4 3 1 : 8번
		//4 4 1 : 12번
		
		//4 1 2 : 0번
		//4 2 2 : 2번
		//4 3 2 : 4번
		//4 4 2 : 6번
		
		//4 1 3 : 0번
		//4 2 3 : 4번
		//4 3 3 : 8번
		//4 4 3 : 12번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		arr[0] = 1;
		
		int NLgcd = gcd(N, L);
		if(NLgcd == 1) {
			System.out.println(N * (M-1));
		}else {
			System.out.println(NLgcd * (M-1));
		}
		
	}
	
	public static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}
