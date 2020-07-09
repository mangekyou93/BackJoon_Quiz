package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1992 {

	//백준 문제 1992 : 쿼드트리
	static int[][] video;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//N은 언제나 2의 제곱 수
		//1 <= N <= 64
		int N = Integer.parseInt(br.readLine());
		video = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			String[] s = br.readLine().split("");
			for(int j=0 ; j<s.length ; j++) {
				video[i][j] = Integer.parseInt(s[j]);
			}
		}
		dq(N, 0, 0);
		System.out.println(sb);
	}
	
	public static void dq(int n, int x, int y) {
		if(check(n, x, y)) {
			sb.append(video[x][y]);
		}else {
			sb.append("(");
			int size = n / 2;
			for(int i=x ; i<x+n ; i+=size) {
				for(int j=y ; j<y+n ; j+=size) {
					dq(size, i, j);
				}
			}
			sb.append(")");
		}
		
	}
	
	public static boolean check(int n, int x, int y) {
		int std = video[x][y];
		for(int i=x ; i<x+n ; i++) {
			for(int j=y ; j<y+n ; j++) {
				if(std != video[i][j]) return false;
			}
		}
		
		return true;
	}
	
}
