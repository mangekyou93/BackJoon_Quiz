package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1427 {

	//백준 문제 1427 : 소트인사이드
	//메모리 : 13MB / 시간 : 0.076 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int[] arr = new int[10];
		
		for(int i=0 ; i<s.length() ; i++) {
			arr[s.charAt(i) - 48]++;
		}
		
		for(int i=9 ; i>=0 ; i--) {
			while(arr[i] > 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		
		System.out.println(sb);
	}

}
