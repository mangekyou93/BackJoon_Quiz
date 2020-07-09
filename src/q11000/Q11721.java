package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11721 {
	
	//백준 문제 11721 : 열 개씩 끊어 출력하기
	//분류 : 출력
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int count = 0;
		
		for(int i=0 ; i+10<s.length() ; i+=10) {
			sb.append(s.substring(i, i+10)).append("\n");
			count++;
		}
		sb.append(s.substring(count*10, s.length()));
		System.out.println(sb);
	}
	
}
