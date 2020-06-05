package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1436 {
	
	//백준 문제 1436 : 영화감독 숌
	//브루트포스 문제
	public static void main(String[] args) throws Exception {
		
		//1.  666	0
		//2.  1666	1
		//3.  2666	2
		//4.  3666	3
		//5.  4666	4
		//6.  5666	5
		//7.  6661	6
		//8.  6662	7
		//9.  6663	8
		//10. 6664	9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] s = new String[10000];
		s[0] = "666";
		
		for(int i=1 ; i<n ; i++) {
			s[i] = i+s[i];
		}
	}

}
