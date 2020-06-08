package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3040 {

	//���� ���� 3040 : �鼳 ���ֿ� �ϰ� ������
	//�з� : �ݺ���
	//����Ž������ �˾Ҵµ� �ƴϿ���
	//1~9���� ���� �Ϳ� - 100�� �ϸ�
	//������ �� = �� �������� ��
	//�� �ڵ�� ������ ��츸 �Է����� �־����� ������ �����ϴ�.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		int x=0,y=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(sum - 100 == arr[i]+arr[j]) {
					x = i;
					y = j;
					System.out.println(x+" "+y);
				}
			}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(i != x && i != y) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}
