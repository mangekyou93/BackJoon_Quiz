package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {

	//백준 문제 2908 : 상수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = reverse(Integer.parseInt(st.nextToken()));
		int b = reverse(Integer.parseInt(st.nextToken()));
		
		System.out.println(a > b ? a : b);
		
	}
	
	public static int reverse(int num) {
		
		String rNum = "";
		
		while(num != 0) {
			rNum += num%10;
			num = num/10;
		}
		
		return Integer.parseInt(rNum);
	}
}
