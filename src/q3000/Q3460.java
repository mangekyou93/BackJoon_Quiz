package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3460 {

	//���� ���� 3460 : ������
	//�з� : �Թ���
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			
			String s = Integer.toString(n, 2);
			
			int count = 0;
			int len = s.length()-1;
			while(len - count >= 0) {
				if(s.charAt(len-count) - '0' == 1) {
					sb.append(count).append(" ");
				}
				count++;
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
