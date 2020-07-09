package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5576 {

	//백준 문제 5576 : 콘테스트
	//분류 : 구현
	static int[] score = new int[101];
	static StringBuilder sb = new StringBuilder();
	
	public static void sum() {
		int sum = 0;
		int count = 0;
		
		for(int i=score.length-1 ; i>0 ; i--) {
			if(score[i] == 0) continue;
			while(score[i] > 0) {
				count++;
				sum += i;
				score[i]--;
				if(count == 3) {
					sb.append(sum);
					return ;
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0 ; i<20 ; i++) {
			score[Integer.parseInt(br.readLine())]++;
			
			if(i == 9) {
				sum();
				sb.append(" ");
				score = new int[101];
			}
			
		}
		sum();
		
		System.out.println(sb);
	}
	
}
