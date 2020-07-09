package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2902 {

	//���� ���� 2902 : KMP�� �� KMP�ϱ�?
	//�з� : ���ڿ� ó��
	
	//KMP �˰����� KMP�� ������ �̸� ���� ����� ���� Knuth, Morris, Prett�̱� �����̴�. �̷��� �˰��򿡴� �߰��� ����� ���� ���� �̸��� ���̴� ��찡 ����.
	//�� �ٸ� ����, ������ ���Ī ��ȣȭ �˰��� RSA�� �̸� ���� ����� �̸��� Rivest, Shamir, Adleman�̴�.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken().charAt(0));
		}
		
		System.out.println(sb);
	}
	
}
