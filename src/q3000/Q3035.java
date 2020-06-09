package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3035 {
	
	//���� ���� 3035 : ��ĳ��
	//�з� : �ݺ���
	//4�� ������ �� ���� ���̾�
	//�̷� �ݺ��� ������ �׳� �����ϴ°� �� ������
	//���� 2���� �迭�� 2�����̳� ������
	
	//�׸��� print�� StringBulider�� ���̴� Ȯ���ϴ�.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int ZR = Integer.parseInt(st.nextToken());
		int ZC = Integer.parseInt(st.nextToken());
		
		/*
		//�޸� : 14MB / �ð� : 0.092 s
		char[][] input = new char[R][C];
		char[][] scan = new char[R*ZR][C*ZC];
		
		for(int i=0 ; i<R ; i++) {
			input[i] = br.readLine().toCharArray();
		}
		
		for(int i=0 ; i<R*ZR ; i++) {
			for(int j=0 ; j<C*ZC ; j++) {
				scan[i][j] = input[i/ZR][(j/ZC)];
				sb.append(scan[i][j]);
			}
			sb.append("\n");
		} 
		System.out.println(sb);
		*/
		
		
		
		//4�� ����
		//�޸� : 14MB / �ð� 0.084 s
		char[][] arr = new char[51][51];
		
		for(int i=0 ; i<R ; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < R; i++)
		{
			for (int l = 0; l < ZR; l++)
			{
				for (int j = 0; j < C; j++)
				{
					for (int k = 0; k < ZC; k++)
						sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
		
		
		/*
		//�޸� : 21MB / �ð� : 0.324 s
		char[][] input = new char[R][C];
		char[][] scan = new char[R*ZR][C*ZC];
		
		for(int i=0 ; i<R ; i++) {
			input[i] = br.readLine().toCharArray();
		}
		
		for(int i=0 ; i<R*ZR ; i++) {
			for(int j=0 ; j<C*ZC ; j++) {
				scan[i][j] = input[i/ZR][(j/ZC)];
				System.out.print(scan[i][j]);
			}
			System.out.println();
		} 
		*/
	}

}
