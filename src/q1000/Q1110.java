package q1000;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1110 {

	//백준 문제 1110 : 더하기 사이클
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = n;
		int count = 1;
		
		while(true) {
			int a = x/10;
			int b = x%10;
			x = Integer.parseInt(""+b+((a+b)%10));
			
			if(n == x) {
				System.out.println(count);
				break;
			}
			count++;
		}
		
	}
}
