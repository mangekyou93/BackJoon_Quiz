package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3076 {
	
	//���� ����  3076 : ������� ü����
	//�з� : �ݺ���
	//���� ���� 1018(ü���� �ٽ� ĥ�ϱ�, ���Ʈ ����)�� Ǯ��� ���� �̰� ���� Ǯ��þ�� �߳�
	
	//������ ����� ����
	//�޸� �Ƴ����� 2���� �迭 �ȸ����, ���ڿ��� ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<R*A ; i++) {
			if((i / A) % 2 == 0) {
				for(int j=0 ; j<C*B ; j++) {
					if((j / B) % 2 == 0) {
						sb.append("X");
					} else {
						sb.append(".");
					}
				}
			} else {
				for(int j=0 ; j<C*B ; j++) {
					if((j / B) % 2 == 0) {
						sb.append(".");
					} else {
						sb.append("X");
					}
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
