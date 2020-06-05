package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2750 {

	//���� ���� 2750 : �� �����ϱ�
	//���ؿ��� �����̳�, ������ ����϶�� �ؼ�
	//�������� ���
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n  ; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}

}
