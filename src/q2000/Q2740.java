package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2740 {

	//백준 문제 2740 : 행렬 곱셈
	
	//3중 for문으로 해결
	//메모리 : 16MB / 시간 : 0.136 s
	static int[][] matrix;
	static int[][] NM;
	static int[][] MK;
	static BufferedReader br;
	
	public static void main(String[] args) throws Exception{
	
		br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		NM = getValue(N,M);
		
		st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		MK = getValue(M,K);
		
		matrix = new int[N][K];
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<K ; j++) {
				for(int k=0 ; k<M ; k++) {
					matrix[i][j] += NM[i][k] * MK[k][j];
				}
				sb.append(matrix[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int[][] getValue(int a, int b) throws Exception {
		int[][] arr = new int[a][b];
		for(int i=0 ; i<a ; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0 ; j<b ; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		return arr;
	}
}
