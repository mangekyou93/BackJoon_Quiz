package q2000;

import java.util.Scanner;

public class Q2884 {

	//���� ���� 2884 : �˶� �ð�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//��� 1 : �� �� -> �� , -45 , �� -> �� ��			//���� ����... ���ظ� ���ϰ���..
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
		
		//��� 2 : ���� ���� �����̸� �ð��� -1 ���ش�.
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
