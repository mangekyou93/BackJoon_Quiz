package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11719 {
	
	//백준 문제 11719 : 그대로 출력하기 2
	//분류 : 출력
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		while((str = br.readLine()) != null) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
