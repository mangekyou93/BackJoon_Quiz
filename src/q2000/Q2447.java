package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2447 {

	//���� ���� 2447 : �� ��� - 10
	//�̰͵� ���� �������� : �տ��� �Ǻ���ġ�� ���������� �ɰ��鼭 �ᱹ �������� �Ǻ���ġ������ �ϼ���.
	//���� ���� �������� ��͸� ȣ���ϸ鼭 ���� ���� ������ �� ��, �ϳ��� �迭�� ä����.
	
	//N=3
	//***
	//* *
	//***
	
	//N=9=3^2
	//*********
	//* ** ** *
	//*********
	//***   ***
	//* *   * *
	//***   ***
	//*********
	//* ** ** *
	//*********
	
	//2���� �迭, N=3�̸� star[1][1]�� ����
	//��, [0][0] -> [0][1] -> [0][2] -> [1][0] : ���� ä��� [1][1]�� ��������
	//N=9�̸� N=3�� ���� �Ȱ��� ä��� 5��°�� �� ����
	
	static char[][] star;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		star = new char[n][n];
		
		printStar(n, 0, 0, false);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	
	public static void printStar(int n, int x, int y, boolean blank) {
		
		//���� ĭ�� ���
		if(blank) {
			for(int i=x ; i<x+n ; i++) {
				for(int j=y ; j<y+n ; j++) {
					star[i][j] = ' ';
				}
			}
			return ;
		}
		
		if(n == 1) {
			star[x][y] = '*';
			return ;
		}
		
		/*
		N=27 �� ��� �� ����� ������� 9�̰�, 
		N=9 �� ��� �� ����� ������� 3�̵�
		�ش� ����� �� ĭ�� ���� ������ �ǹ� size
        
		count�� �� ��� ������ �ǹ�
		*/

		int size = n / 3;
		int count = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				if (count == 5) { // ���� ĭ�� ���
					printStar(size, i, j, true);
				} else {
					printStar(size, i, j, false);
				}
			}
		}
	}
}
