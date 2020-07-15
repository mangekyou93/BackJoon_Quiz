package programmers.level1;

public class MakeAvg {

	//level 1
	//프로그래머스 문제 : 평균 구하기
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		double answer = 0;
		for(int i=0 ; i<arr.length ; i++) {
			answer += arr[i];
		}
		
		answer = answer/arr.length;
		System.out.println(answer);
	}
	
}
