package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11720 {

	//백준 문제 11720 : 숫자의 합
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String text = br.readLine();
		int sum = 0;
		for(int i=0 ; i<text.length() ; i++) {
			sum += text.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
