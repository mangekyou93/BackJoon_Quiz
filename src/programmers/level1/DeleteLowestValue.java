package programmers.level1;

import java.util.Arrays;

public class DeleteLowestValue {

	//level 1
	//프로그래머스 문제 : 제일 작은 수 제거하기
	public static void main(String[] args) {
		int[] arr = {10};
		int[] answer;
		
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			int min = Integer.MAX_VALUE;
			for(int i=0 ; i<arr.length ; i++) {
				min = Math.min(min, arr[i]);
			}
			answer = new int[arr.length - 1];
			
			int index = 0;
			for(int i=0 ; i<arr.length ; i++) {
				if(min == arr[i]) continue;
				answer[index] = arr[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
}
