package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065 {

	//백준 문제 1065 : 한수
	//메모리 : 16MB / 시간 : 0.128 s
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n > 99) {
			int count = 99;
			
			for(int i=100 ; i<=n ; i++) {
				String[] s = String.valueOf(i).split("");
				int same = 0;
				for(int j=1 ; j<s.length ; j++) {
					if(j == 1) {
						same = Integer.parseInt(s[j]) - Integer.parseInt(s[j-1]);
					} else {
						if(same == Integer.parseInt(s[j]) - Integer.parseInt(s[j-1])) {
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		} else {
			System.out.println(n);
		}
	}
	
	 private static int checkHanNumber(int number) {
	        int num1 = number / 100 % 10;
	        int num2 = number / 10 % 10;
	        int num3 = number % 10;
	         
	        if (num2 * 2 == num1 + num3) {				//등차수열 3자리 원리 : 가운데 x2 =  첫 자리 + 끝 자리
	            return 1;
	        }
	        return 0;
	    }
}
