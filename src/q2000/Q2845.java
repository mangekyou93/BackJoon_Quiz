package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2845 {

	//���� ���� 2845 : ��Ƽ�� ������ �� ��
	//�з� : �Թ���
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int LP = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			sb.append(Integer.parseInt(st.nextToken()) - LP).append(" ");
		}
		
		System.out.println(sb);
	}
}
