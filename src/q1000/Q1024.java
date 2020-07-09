package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1024 {

	//백준 문제 
	//분류 : 탐색
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int b = (int)(N/3);
		int a = b - 1;
		int c = b + 1;
		
		String ans = "-1";
		int count = 2;
		while(a+b+c <= N) {
			if(a+b+c == N) {
				ans = a+" "+b+" "+c;
				break;
			}
			
			if(a+b+c < N) {
				if(count > L) break;
				if(b < c && b+1 != c) {
					b++;
				} else {
					c++;
					count++;
				}
			}
		}
		
		System.out.println(ans);
	}
}
