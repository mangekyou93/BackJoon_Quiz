package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1735 {
	
	//백준 문제 1735 : 분수 합
	//분류 : 유클리드 호제법
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());

		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int gcd = gcd(b, d);
		int lcm = (b*d)/gcd;
		
		int x = (c*(lcm/d)) + (a*(lcm/b));
		
		sb.append(x/gcd(x, lcm)).append(" ").append(lcm/gcd(x, lcm));

		System.out.println(sb);
	}
	
	public static int gcd(int a, int b) {
		int n = 0;
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while(b != 0) {
			n = a%b;
			a = b;
			b = n;
		}
		
		return a;
	}
}
