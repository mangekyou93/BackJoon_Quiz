package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10797 {

	//백준 문제 10797 : 10부제
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		
		while(st.hasMoreTokens()) {
			if(n == Integer.parseInt(st.nextToken())) count++;
		}
		
		System.out.println(count);
	}
}
