package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2810 {
	
	//���� ���� 2810 : ��Ȧ��
	//�з� : �ݺ���
	//Ʋ�� ���� ã�Ƴ��� �͵� ��û ������ �� ���ϴ�.
	//Ʋ�ȴٰ� ������ ����? �´µ���� �µ� ���ٴ�
	//�Է� ������ ���� �غ��� ���߿� ����üũ�� �� �� ���� ���׿��� �����ϴ�.
	public static void main(String[] args) throws Exception {
		
		//��� ���� ã�� ������ ��Ȧ�� ������ ã�� ���� �ƴ�.
		//ex) S  -> *S*		: 2(x) 1(o)
		//	  SS -> *S*S*	: 3(x) 2(o)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine().toUpperCase();
		int count = 0;
		
		if(!s.contains("LL")) {
			sb.append(n);
		} else {
			for(int i=0 ; i<s.length() ; i++) {
				if(s.charAt(i) == 'S') {
					count++;
				} else if(s.charAt(i) == 'L') {
					count++;
					i++;
				}
			}
			sb.append(count+1);
		}
		
		System.out.println(sb);
	}

}
