package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11656 {

	//백준 문제 11656 : 접미사 배열
	//분류 : 문자열 처리
	
	//메모리 : 19MB / 시간 : 0.1s
	//생각보다 시간이 많이나옴
	//아마도 Arrays.sort가 퀵 정렬인데 최악의 경우가 몇 개 있나봄
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		String[] arr = new String[s.length()];
		
		for(int i=0 ; i<s.length() ; i++) {
			arr[i] = s.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
