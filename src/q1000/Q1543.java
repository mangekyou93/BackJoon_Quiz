package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1543 {

	//���� ���� 1543 : ���� �˻�
	//�з� : ���ڿ� ó��
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String file = br.readLine();
		String find = br.readLine();
		int count = 0;

		
		while(file.contains(find)) {
			int a = file.indexOf(find);
			int b = find.length();
			
			if(a == 0) {
				count++;
				file = file.substring(b);
			}else {
				count++;
				file = file.substring(a+b, file.length());
			}
			
			//count++;
			//file = file.substring(a+b, file.length());
			//�̷��Ը� �ᵵ ������ 
			//a == 0�̸� a+b = b;
			
			//file = file.substring(a+b);
			//�̰͵� ��
		}
		
		System.out.println(count);
	}
}
