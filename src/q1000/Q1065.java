package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065 {

	//���� ���� 1065 : �Ѽ�
	//�޸� : 16MB / �ð� : 0.128 s
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
	         
	        if (num2 * 2 == num1 + num3) {				//�������� 3�ڸ� ���� : ��� x2 =  ù �ڸ� + �� �ڸ�
	            return 1;
	        }
	        return 0;
	    }
}
