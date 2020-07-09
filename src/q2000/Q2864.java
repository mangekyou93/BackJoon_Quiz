package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2864 {

	//백준 문제 2864 : 5와 6의 차이
	//분류 : 문자열 처리
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		sb.append(minValue(A,B)).append(" ").append(maxValue(A, B));
		
		System.out.println(sb);
	}
	
	public static int minValue(String A, String B) {
		String temp = new String();
		for(int i=0 ; i<A.length() ; i++) {
			if(A.charAt(i) == '6') {
				temp += "5";
				continue;
			}
			temp += A.charAt(i);
		}
		A = temp;
		temp = new String();
		for(int i=0 ; i<B.length() ; i++) {
			if(B.charAt(i) == '6') {
				temp += "5";
				continue;
			}
			temp += B.charAt(i);
		}
		B = temp;
		
		return Integer.parseInt(A)+Integer.parseInt(B);
	}
	
	public static int maxValue(String A, String B) {
		String temp = new String();
		for(int i=0 ; i<A.length() ; i++) {
			if(A.charAt(i) == '5') {
				temp += "6";
				continue;
			}
			temp += A.charAt(i);
		}
		A = temp;
		temp = new String();
		for(int i=0 ; i<B.length() ; i++) {
			if(B.charAt(i) == '5') {
				temp += "6";
				continue;
			}
			temp += B.charAt(i);
		}
		B = temp;
		
		return Integer.parseInt(A)+Integer.parseInt(B);
	}
	
}
