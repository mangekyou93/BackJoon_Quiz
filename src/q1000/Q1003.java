package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1003 {
	
	//백준 문제 1003 : 피보나치 함수
	static int[] count0;
	static int[] count1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			count0 = new int[n+2];
			count1 = new int[n+2];
			count0[0] = 1;
			count1[1] = 1;
			for(int i=2 ; i<=n ; i++) {
				count0[i] = count0[i-1] + count0[i-2];
				count1[i] = count1[i-1] + count1[i-2];
			}
			
			//fibonacciFunction(n);
			
			sb.append(count0[n]+" "+count1[n]+"\n");
		}
		
		System.out.println(sb);
	}
		
}
