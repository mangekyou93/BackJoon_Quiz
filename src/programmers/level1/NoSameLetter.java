package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class NoSameLetter {
	
	//level 1
	//프로그래머스 문제 : 같은 숫자는 싫어
	public static void main(String[] args) {
		
		int[] arr = {4,4,4,3,3};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0 ; i<arr.length ; i++) {
			if(al.isEmpty()) {
				al.add(arr[i]);
				continue;
			}
			
			if(al.get(al.size()-1) != arr[i]) {
				al.add(arr[i]);
			}
		}
		
		int[] answer = new int[al.size()];
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = al.get(i);
		}
		
	}
}
