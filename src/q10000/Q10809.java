package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10809 {

	//백준 문제 10809 : 알파벳 찾기
	//메모리 : 13MB / 시간 : 0.072 s
	//아스키 코드 a~z = 97 ~ 122
	//중복된 값(ex. bacdcaaa , aaaaa)를 처리하는 과정이 좀 느림...
	//중복된 값을 처리하지 않아도 조건에서 흘려보낼 방법이 있음...
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		int[] arr = new int[26];
		int a = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			a = s.charAt(i) - 'a';
			if(arr[a] == 0) {
				arr[a] = i+1;
			}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			sb.append(arr[i]-1+" ");
		}
		
		System.out.println(sb);
	}
}
