package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {

	//백준 문제 1920 : 수 찾기
	
	//2020-07-01 : 틀렸습니다. 포기
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<N ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<M ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0 ; i<M ; i++) {
			int std = arr[i];
			
			if(std < A[0]) {
				sb.append("0").append("\n");
			} else if(std > A[N-1]) {
				sb.append("0").append("\n");
			} else {
				int min = 0;
				int max = N;
				
				while(min+1 < max) {
					int mid = (min+max) / 2;
					
					if(std >= A[mid]) min = mid;
					else max = mid;
				}
				
				if(A[min] == std) sb.append("1").append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
