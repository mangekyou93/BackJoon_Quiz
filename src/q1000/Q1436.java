package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1436 {
	
	//���� ���� 1436 : ��ȭ���� ��
	//���Ʈ���� ����
	//�޸� 160MB / �ð� : 0.352 s
	//�޸𸮸� ���� ���µ� ���� ���� ������???
	//ó������ 666�� +1 �̷��ñ�� ä����ٰ� ������ ������.
	//�ᱹ contains�� �� ���ư��� �ſ���, ���� �ڵ带 �߸� «... �ݼ�����..
	public static void main(String[] args) throws Exception {
		
		//1.  666	0
		//2.  1666	1
		//3.  2666	2
		//4.  3666	3
		//5.  4666	4
		//6.  5666	5
		//7.  6660	6
		//8.  6661	7
		//9.  6662	8
		//10. 6663	9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = 666;
		int count = 0;
		
		while(true) {
			if(String.valueOf(a).contains("666")) {
				count++;
			}
			
			if(count == n) {
				System.out.println(String.valueOf(a));
				break;
			}
			
			a++;
		}
		
		/*
		 * �� �� §�ڵ�
		int a = 665;
		while(n>0) {
			a++;
			if(String.valueOf(a).contains("666")) {
				n--;
			}
		}
		System.out.println(a);
		*/
	}

}
