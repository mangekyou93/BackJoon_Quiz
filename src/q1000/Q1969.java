package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1969 {

	//백준 문제 1969 : DNA
	//분류 : 그리디 알고리즘
	static int[] line;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		line = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		line[arr[0]] = 1;
		
		
		for(int i=1 ; i<N ; i++) {
			int hCnt = arr[i];
			
			for(int j=0 ; j<N ; j++) {
				if(line[j] != 0) continue;
				if(hCnt == 0) {
					line[j] = i+1;
					break;
				}
				hCnt--;
			}
		}
		
		for(int i=0 ; i<line.length ; i++) {
			sb.append(line[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
