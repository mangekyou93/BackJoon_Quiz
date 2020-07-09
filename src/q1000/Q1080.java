package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1080 {

	//백준 문제 1080 : 행렬
	//분류 : 그리디 알고리즘
	static int[][] A;
	static int[][] B;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		A = new int[N][M];
		B = new int[N][M];
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				A[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				B[i][j] = s.charAt(j) - '0';
			}
		}
		
		
	}
}
