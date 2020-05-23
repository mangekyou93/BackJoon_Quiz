package q2000;

import java.util.Scanner;

public class Q2884 {

	//백준 문제 2884 : 알람 시계
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//방법 1 : 시 분 -> 분 , -45 , 분 -> 시 분			//오류 나옴... 이해를 못하겠음..
//		int h = sc.nextInt();
//		int m = sc.nextInt();
//		
//		int t = (h * 60) + m - 45;
//		
//		if(t > 0) {
//			h = t / 60;
//			m = t % 60;
//			
//			System.out.println(h+" "+m);
//		} else {
//			h = (1440 + t) / 60;
//			m = (1440 + t) % 60;
//			
//			System.out.println(h+" "+m);
//		}
		
		//방법 2 : 분을 빼서 음수이면 시간을 -1 해준다.
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M-45 < 0) {
			H--;
			M = M - 45 + 60;
			
			if(H < 0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		} else {
			System.out.println(H+" "+(M-45));
		}
		
	}
}
