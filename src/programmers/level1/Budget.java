package programmers.level1;

import java.util.Arrays;

public class Budget {

	//level 1
	//프로그래머스 문제 : 예산
	//Summer/Winter Coding(~2018)
	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		int budget = 10;
		
		Arrays.sort(d);
		
		int answer = 0;
		for(int i=0 ; i<d.length ; i++) {
			if(budget < d[i]) break;
			budget -= d[i];
			answer++;
		}
		
		System.out.println(answer);
	}
	
}
