package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2562 {

	//백준 문제 2562 : 최댓값
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int index = 1;
		int count = 0;
		
		while(index <= 9) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > max) {
				max = value;
				count = index;
			}
			index++;
		}
		
		System.out.println(max);
		System.out.println(count);
	}
}
