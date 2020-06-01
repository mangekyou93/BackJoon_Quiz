package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1193 {

	//백준 문제 1193 : 분수찾기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int range = 1;
		
		while(true) {
			if(range >= x) {
				int check = x - (range - cnt);
				// x == 14 , check == 4
				// x == 11 , check == 1
				if(cnt % 2 == 0) {		// 짝수	: 앞자리 = count까지 + , 뒷자리 : 1까지 -
					System.out.println(check+"/"+(cnt-check+1));
				} else {				// 홀수	: 앞자리 = 1까지 - , 뒷자리 : count까지 +
					System.out.println((cnt-check+1)+"/"+check);
				}
				break;
			}
			
			range += ++cnt;
		}
		
	}

}
