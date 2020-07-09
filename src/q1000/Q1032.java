package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1032 {

	//���� ���� 1032 : ��� ������Ʈ
	//�з� : ���ڿ� ó��
	
	//���� ��������..
	//�̰��ϳ� ���ϸ� ��ϴ�
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String s = new String();
		for(int i=0 ; i<N ; i++) {
			s += br.readLine()+"\n";
		}
		
		int delim = s.indexOf("\n")+1;
		
		for(int i=0 ; i<delim-1 ; i++) {
			char ch = s.charAt(i);
			int j = i;
			while(true) {
				j += delim;
				if(j >= s.length()) {
					sb.append(ch);
					break;
				}else if(ch != s.charAt(j)) {
					sb.append("?");
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
	
}
