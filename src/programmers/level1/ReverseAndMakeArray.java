package programmers.level1;

import java.util.Arrays;

public class ReverseAndMakeArray {

	//level 1
	//프로그래머스 문제 : 자연수 뒤집어 배열로 만들기
	public static void main(String[] args) {
		long n = 12345;
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		s = sb.reverse().toString();
		
		int[] answer = new int[s.length()];
		
		for(int i=0 ; i<s.length() ; i++) {
			answer[i] = s.charAt(i) - '0';
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	//다른 풀이
	public static int[] solution(long n) {
		int[] answer = new int[String.valueOf(n).length()];
		int i=0;
		while(n > 0) {
			answer[i] = (int)(n%10);
			n /= 10;
			i++;
		}
		
		return answer;
	}
}
