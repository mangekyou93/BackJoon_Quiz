package q14000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14501 {

	//���� ���� 14501 : ���
	//�з� : ���Ʈ ���� 
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[N][0] = Integer.parseInt(st.nextToken());
			arr[N][1] = Integer.parseInt(st.nextToken());
		}
		
		
		//N�� ����� ������ �ȵ�.
		//���� �ִ��� ���� �ϴ� �ͺ���, ���� ���� �ִ� ���� �� ���� ���� ����.
		int a = N;
		int count = 0;
		while(N >= 0) {
			for(int i=0 ; i<a ; i++) {
				
				N -= arr[i][0];
			}
		}
	}
}
