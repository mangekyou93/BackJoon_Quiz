package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5032 {

	//백준 문제 5032 : 탄산 음료
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int count = 0;
		int d = e+f;
		
		
		//시간 초과 d > 2라고 해서 시간 초과 나옴
		while(d >= c) {
			int a = d/c;
			int b = d%c;
			count += a;
			d = a+b;
		}
		
		System.out.println(count);
	}
	
}
