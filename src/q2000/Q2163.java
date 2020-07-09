package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2163 {

	//백준 문제 2163 : 초콜릿 자르기
	//분류 : 수학
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println((Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())) - 1);
		
	}
	
}
