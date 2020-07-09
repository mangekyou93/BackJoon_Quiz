package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10798 {

	//���� ���� 10798 : �����б�
	//�з� : ����
	//������ ���� *�� �־���
	//���� ������ '\0'�̴�.
	//��¥ ���� �����ε� String���� ������� �ϴٺ��ϱ� �����
	//2���� �迭�� ������ �ݹ� Ǯ������
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] board = new char[5][15];
		
		for(int i=0 ; i<5 ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<15 ; j++) {
				if(j < s.length()) {
					board[i][j] = s.charAt(j);
				} else {
					board[i][j] = '*';
				}
			}
		}
		
		
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(board[j][i] == '*') continue;
				sb.append(board[j][i]);
			}
		}
		
		
		System.out.println(sb);
	}
	
}
