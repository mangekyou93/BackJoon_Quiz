package q15000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {

	//백준 문제 15650 : N과 M (2)
	static StringBuilder sb = new StringBuilder();
	static int[] arr = new int[10];
	static boolean[] used = new boolean[10];
	static int N, M;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		back(0);
		
		System.out.println(sb);
	}
	
	public static void back(int k) {
		if(k == M) {
			for(int i=0 ; i<M ; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return ;
		}
		
		for(int i=1 ; i<=N ; i++) {
			if(!used[i]) {
				arr[k] = i;
				used[i] = true;
				back(k+1);
				used[i] = false;
			}
		}
	}

}
