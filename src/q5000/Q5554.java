package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5554 {

	//���� ���� 5554 : �ɺθ� ���� ��
	//�з� : ����
	//�ݺ����� �ڵ�� ª����, �޸𸮿� �ð��� �� ��ƸԴ´�.
	//������, �� ���� �ȳ��� �ð���
	//0.004��, �޸𸮵� 0.1MB ����?
	//�׷��� �Է� �����Ͱ� �󸶳Ŀ� ���� ũ�� ���̳� ������ ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		/*
		//�޸� : 12768KB / �ð� : 68ms
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int sum = a+b+c+d;
		
		int x = sum / 60;
		int y = sum % 60;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//�޸� : 12892KB / �ð� : 72ms
		int sum = 0;
		for(int i=0 ; i<4 ; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}
