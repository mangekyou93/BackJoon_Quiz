package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorArray {

	//level 1
	//프로그래머스 문제 : 나누어 떨어지는 숫자 배열
	public static void main(String[] args) {
		
		int arr[] = {5, 9, 7, 10};
		int divisor = 5;
		
		Arrays.sort(arr);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] % divisor == 0) al.add(arr[i]);
		}
		
		int[] answer;
        if(al.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[al.size()];
            for(int i=0 ; i<al.size() ; i++) {
                answer[i] = al.get(i);
            }
        }
        
        //return answer;
	}
	
}
