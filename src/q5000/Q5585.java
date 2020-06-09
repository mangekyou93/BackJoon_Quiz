package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5585 {

	//���� ����  5585 : �Ž�����
	//�з� : ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = {500, 100, 50, 10, 5, 1};
		int n = 1000 - Integer.parseInt(br.readLine());		//�Ž��� ��
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			
			if(n / arr[i] > 0) {
				count += n / arr[i];
			}
			
			n %= arr[i];
		}
		
		System.out.println(count);
		
	}
}
