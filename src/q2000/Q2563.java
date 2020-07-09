package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563 {
	
	//백준 문제 2563 : 색종이
	//분류 : 구현
	static int[][] paper = new int[100][100];
	static int[][] sqaure = new int[10][10];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int sum = n*100;
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int i=a ; i<a+10 ; i++) {
				for(int j=b ; j<b+10 ; j++) {
					paper[i][j]++;
				}
			}
			
		}
		
		for(int i=0 ; i<100 ; i++) {
			for(int j=0 ; j<100 ; j++) {
				if(paper[i][j] < 2) continue;
				sum -= paper[i][j]-1;
			}
		}
		
		System.out.println(sum);
	}
}
