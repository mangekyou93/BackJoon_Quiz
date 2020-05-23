package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1157 {

	//백준 문제 1157 : 단어 공부
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		s = s.toUpperCase();
		
		int[] arr = new int[26];
		int max = 0;
		char answer = '?';
		
		for(int i=0 ; i<s.length() ; i++) {
			arr[s.charAt(i) - 'A']++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = (char)(i + 65);
			} else if(arr[i] != 0 && arr[i] == max) {
				answer = '?';
				//break;									오답 노트 : aabbcccc -> 2, 2, 4인데 ?가 나옴 ::: C가 나와야 함
			}
		}
		
		System.out.println(answer);
	}
}
