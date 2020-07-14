package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6603 {

	//백준 문제 6603 : 로또
	//분류 : 입문용, BFS, DFS, 브루트 포스, 백트래킹
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			if(n < 7) break;

			arr = new int[n];
			for(int i=0 ; st.hasMoreTokens() ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			lotto();
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void lotto() {
		
	}
	
	public static void printNumber() {
		
	}
}
