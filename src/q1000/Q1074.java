package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {

	//���� ���� 1074 : Z
	//�з� : ��� ȣ��
	
	//ZŽ�� �˰��� ����
	//�׷��� ������ ����
	
	//�ϴ� 2���� �迭�� ������ �����ߴµ�, �޸� �ʰ� ����
	//2���� �迭�� 1���� �迭�� ���̱⸸ �ϸ� ��
	//�迭 ��� �Ұ���...
	//1���� �迭�� 2^15 * 2^15 = 1,073,741,824 ����
	//�޸� : 14MB / �ð� 3.520 s (�ð� ����)
	//flag�� ��
	//�޸� : 14MB / �ð� 3.020 s (�ð� ����)
	//�Ƹ��� ��Ͷ� �߰��ð� �ص�
	//�׷��� �÷��� �ֳ� ������ ���̰� ��û ũ��
	static int r,c, count = 0;
	static boolean flag = false;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = (int)Math.pow(2, Integer.parseInt(st.nextToken()));
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		
		z(N, 0, 0);
		
	}
	
	public static void z(int n, int x, int y) {
		if(n == 1) {
			if(x == r && y == c) {
				System.out.println(count);
				flag = true;
			}
			count++;
			return;
		}
		
		if(flag) return;
		int s = n/2;
		
		z(s, x, y);
		z(s, x, y+s);
		z(s, x+s, y);
		z(s, x+s, y+s);
	}
	
}
