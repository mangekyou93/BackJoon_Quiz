package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5596 {

	//백준 문제 5596 : 시험 점수
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] arr = new int[2];
		for(int i=0 ; i<2 ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				arr[i] += Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(Math.max(arr[0], arr[1]));
	}
}
