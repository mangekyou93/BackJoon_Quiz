package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1072 {

	//백준 문제 1072 : 게임
	//분류 : 탐색
	
	//보류
	//이분 탐색 or Parametric Search를 사용해야한다고 함
	//근데 이분 탐색을 봐도 모르겠음...
	static long X, Y, Z;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		X = Long.parseLong(st.nextToken());
		Y = Long.parseLong(st.nextToken());
		Z = Y * 100 / X;
		
		System.out.println(Z >= 99 ? -1 : binarySearch(1, X));
		
	}
	
	public static long binarySearch(long start, long end) {
		long mid = 0;
		long ratio = 0;
		
		while(start <= end) {
			mid = (start + end) / 2;
			ratio = (Y + mid) * 100 / (X + mid);
			
			if (ratio > Z) {
				end = mid - 1;
	        } else {
	        	start = mid + 1;
	        }
		}
		
		return start;
	}
}
