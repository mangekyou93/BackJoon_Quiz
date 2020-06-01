package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1193 {

	//���� ���� 1193 : �м�ã��
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
				if(cnt % 2 == 0) {		// ¦��	: ���ڸ� = count���� + , ���ڸ� : 1���� -
					System.out.println(check+"/"+(cnt-check+1));
				} else {				// Ȧ��	: ���ڸ� = 1���� - , ���ڸ� : count���� +
					System.out.println((cnt-check+1)+"/"+check);
				}
				break;
			}
			
			range += ++cnt;
		}
		
	}

}
