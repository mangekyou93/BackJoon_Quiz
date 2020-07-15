package programmers.level1;

import java.util.Arrays;

public class FailureRate {

	//level 1
	//프로그래머스 문제 : 실패율
	//2019 KAKAO BLIND RECRUITMENT
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int N = 5;
		int[] answer = new int[N];
		int[] stages = {2,1,2,6,2,4,3,3};
		
		int[] count = new int[N+1];
		for(int i=0 ; i<stages.length ; i++) {
			if(stages[i] > N) continue;
			count[stages[i]]++;
		}
		
		int len = stages.length;
		double[] fail = new double[N+1];
		
		for(int i=1 ; i<count.length ; i++) {
			fail[i] = (double)count[i]/len;
			len -= count[i];
			if(len <= 0) break;
		}
		
		int j = 0;
		while(j < N) {
			int index = 0;
			double max = -1;
			for(int i=1 ; i<N+1 ; i++) {
				if(max < fail[i]) {
					max = fail[i];
					index = i;
				}
			}
			answer[j] = index;
			fail[index] = -2;
			j++;
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
}
