package programmers.level1;

import java.util.Arrays;

public class XIntervalNumberOfN {

	//level 1
	//���α׷��ӽ� ���� : X��ŭ ������ �ִ� n���� ����
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
