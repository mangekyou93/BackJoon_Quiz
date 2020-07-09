package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1107 {

	//백준 문제 1107 : 리모컨
	//분류 : 수학
	
	//2020-07-02 예시를 못 찾겠음
	static boolean[] su = new boolean[1000000];
	static boolean[] arr = new boolean[10];
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		if(M != 0) {
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				arr[Integer.parseInt(st.nextToken())] = true;			//키가 빠진 숫자		true	(사용 불가능)
			}															//키가 안빠진 숫자	false	(사용 가능)
		}
		
		System.out.println(remoteControl(N, M));
	}
	
	public static int remoteControl(int n, int m) {
		if(n == 100) return 0;
		if(m == 0) return String.valueOf(n).length();
		if(m == 10) return Math.abs(n - 100);
		
		int plus = 0;
		for(int i=n ; i<su.length ; i++) {
			String s = String.valueOf(i);
			boolean check = true;
			
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[j]) {
					String temp = String.valueOf(j);
					if(s.contains(temp)) {
						check = false;
						break;
					}
				}
			}
			
			if(check) {
				plus = i;
				break;
			}
		}
		
		int minus = 0;
		for(int i=n ; i>=0 ; i--) {
			String s = String.valueOf(i);
			boolean check = true;
			
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[j]) {
					String temp = String.valueOf(j);
					if(s.contains(temp)) {
						check = false;
						break;
					}
				}
			}
			
			if(check) {
				minus = i;
				break;
			}
		}
		
		minus = n - minus + String.valueOf(minus).length();
		plus = plus - n + String.valueOf(plus).length();
		int hun = Math.abs(n - 100) + 3;
		
		return Math.min(hun, Math.min(minus, plus));
	}
}
