package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6603 {

	//백준 문제 6603 : 로또
	//분류 : 입문용, BFS, DFS, 브루트 포스, 백트래킹
	
	//분류는 입문용인데 못 풀겠네... (2020-06-14)
	//다시 시작 실패 (2020-06-16)
	//이항 계수의 확률인데..
	//n = 7 이면 : 7C6 = 7
	//n = 8 이면 : 8C6 = 8 * 7 / 2 * 1 = 56 / 2 = 28
	//n = 9 이면 : 9C6 = 9 * 8 * 7 / 3 * 2 * 1 = 504 / 6 = 84
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			if(n < 7) break;

			arr = new int[n];
			for(int i=0 ; st.hasMoreTokens() ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			lotto(arr, n, arr.length - 6);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void lotto(int[] arr, int n, int m) {
		
	}
	
	public static void printNumber() {
		
	}
}
