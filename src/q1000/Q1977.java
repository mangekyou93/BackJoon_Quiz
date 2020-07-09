package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1977 {

	//백준 문제 1977 : 완전제곱수
	//분류 : 수학
	static int[] su = new int[10001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<10001 ; i++) {
			int a = i*i;
			if(a > 10000) break;
			su[a]++;
		}
		
		int min = 10001;
		int sum = 0;
		for(int i=M ; i<=N ; i++) {
			if(su[i] == 0) continue;
			sum += i;
			min = Math.min(min, i);
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
}
