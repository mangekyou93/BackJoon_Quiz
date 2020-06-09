package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2490 {

	//백준 문제 2490 : 윷놀이
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		char[] arr = {'D', 'C', 'B', 'A', 'E'};
		int n = 3;
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int sum = 0;
			
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(arr[sum]).append("\n");
		}
		
		System.out.println(sb);
		
	}
}
