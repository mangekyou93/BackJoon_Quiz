package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1159 {

	//백준 문제 1159 : 농구 경기
	//분류 : 반복문
	//메모리 : 14MB / 시간 : 0.072 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[26];
		
		
		while(n-- > 0) {
			String s = br.readLine();
			
			arr[s.charAt(0) - 'a']++;
		}
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i] > 4) {
				sb.append((char)(i+'a'));
				count++;
			}
			
		}
		
		if(count == 0) {
			sb.append("PREDAJA");
		}
		
		System.out.println(sb);
		
	}

}
