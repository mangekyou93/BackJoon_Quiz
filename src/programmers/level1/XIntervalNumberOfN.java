package programmers.level1;

import java.util.Arrays;

public class XIntervalNumberOfN {

	//level 1
	//프로그래머스 문제 : X만큼 간격이 있는 n개의 숫자
	public static void main(String[] args) {
		int x = 10000000;
		int n = 1000;
		long[] answer = new long[n];
		
		int count = 1;
		for(int i=0 ; i<n ; i++) {
			answer[i] = (long)x * count;
			count++;
		}
		
		
		System.out.println(Arrays.toString(answer));
	}
}
