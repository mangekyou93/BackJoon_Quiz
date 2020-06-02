package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2775 {

	//���� ���� 2775 : �γ�ȸ���� ���׾�
	//�Ǻ���ġ ������ ������
	//�� �ٵ� ������ �о ���ذ� �ȵ�.
	//1. �� ���� 1ȣ���� 1���� ��ٶ�� ���� ����.
	//2. 0�� 13ȣ�� 13�� �̰͸� ���ذ� �� --> 0���� iȣ���� i���� ���.
	//3. "a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ�" --> �� ���� �� �Ǻ���ġ ������.
	
	// 1) 2���� �迭�� ����ϸ� 2���� ����� �ִµ� ó�� �ʱ�ȭ�� for������ ���� �־��ش�.						: for���� ������ ���, ���� ä���� �־ ã�⸸ �ϸ��.
	// 2) ������ ������ְ�(��, 1 <= k <= 14, 1 <= n <= 14) �� ���� ȣ ������ ��� ä���ָ鼭 ����		: for���� �پ������, ��� ä��鼭 �����ؾ���
	// 3) ����Լ��� ���� 
	
	// 2���� �迭 / ����Լ� ��������.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			testCase1(br);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void testCase1(BufferedReader br) throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];				//0������ 14�������̹Ƿ� 15��
		
		for(int i=0 ; i<15 ; i++) {
			arr[0][i] = i+1;
			arr[i][0] = 1;
		}
		
		for(int i=1 ; i<15 ; i++) {
			for(int j=1 ; j<15 ; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}

		for(int i=0 ; i<t ; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(arr[k][n-1]+"\n");
		}
		System.out.println(sb);
	}

}
