package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1914 {

	//백준 문제 1914 : 하노이 탑
	//분류 : 재귀 호출
	
	//하노이탑 어느정도는 할 줄 알게됨.
	//BigInteger는 좀 공부해야겠다.
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger bi;
		
		if(N > 20) {
			bi = new BigInteger("1");
			for(int i=0 ; i<N ; i++) {
				bi = bi.multiply(new BigInteger("2"));
			}
			bi = bi.subtract(new BigInteger("1"));
			System.out.println(bi.toString());
		} else {
			hanoi(N, 1, 2, 3);
			System.out.println(count);
			System.out.println(sb);
		}
	}
	
	public static void hanoi(int n, int from, int by, int to) {
		if(n == 1) {
			sb.append(from+" "+to).append("\n");
			count++;
			return ;
		}
		
		hanoi(n-1, from, to, by);
		sb.append(from+" "+to).append("\n");
		count++;
		hanoi(n-1, by, from, to);
		
	}
}
