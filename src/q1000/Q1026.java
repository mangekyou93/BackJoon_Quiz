package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1026 {

	//백준 문제 1026 : 보물
	//분류 : 탐색, 정렬
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[101];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<A.length ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			B[Integer.parseInt(st.nextToken())]++;
		}
		
		
		int sum = 0;
		int len = 0;
		for(int i=B.length-1 ; i>=0 ; i--) {
			if(B[i] == 0) continue;
			while(B[i] > 0) {
				sum += A[len]*i;
				len++;
				B[i]--;
			}
		}
		
		System.out.println(sum);
	}
}
