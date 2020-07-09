package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {

	//���� ���� 2309 : �ϰ� ������
	//�з� : ���Ʈ ���� 
	
	//�̰� �ϳ� Ǫ�µ� ���� 40���� �������...
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[101];
		int sum = 0;
		
		for(int i=0 ; i<9 ; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a] = true;
			sum += a;
		}
		
		sum = sum - 100;
		boolean check = false;
		
		for(int i=1 ; i<arr.length ; i++) {
			if(!arr[i]) continue;
			for(int j=1 ; j<arr.length ; j++) {
				if(!arr[j]) continue;
				if(i + j == sum) {
					arr[i] = false;
					arr[j] = false;
					check = true;
					break;
				}
			}
			if(check) break;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(!arr[i]) continue;
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
