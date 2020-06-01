package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

	//���� ���� 2869 : �����̴� �ö󰡰� �ʹ�
	public static void main(String[] args) throws Exception{
		
		// 1 �� B < A �� V �� 1,000,000,000
		//�ð� ���� 0.15 s == 150 ms �ȿ� �������� : �ݺ����� �Ⱦ��� ������ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int height = v - a;
		int count = 0;
		
		//����
		//�޸� : 13MB / �ð� : 0.68 s
		//�ݺ����� �Ⱦ��� ���� �߿���
		//���� 1712 ���� �б����� ����� ����
		if(height % (a-b) != 0) {
			count = height/(a-b) + 2;
		} else {
			count = height/(a-b) + 1;
		}
		
		System.out.println(count);
		
		
		/*
		//���� ���� : �ð� �ʰ�
		while(true) {
			height += a;
			count++;
			if(height >= v) {
				System.out.println(count);
				break;
			}
			height -= b;
		}
		*/
	}

}
