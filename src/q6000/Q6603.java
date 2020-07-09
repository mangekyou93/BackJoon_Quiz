package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6603 {

	//���� ���� 6603 : �ζ�
	//�з� : �Թ���, BFS, DFS, ���Ʈ ����, ��Ʈ��ŷ
	
	//�з��� �Թ����ε� �� Ǯ�ڳ�... (2020-06-14)
	//�ٽ� ���� ���� (2020-06-16)
	//���� ����� Ȯ���ε�..
	//n = 7 �̸� : 7C6 = 7
	//n = 8 �̸� : 8C6 = 8 * 7 / 2 * 1 = 56 / 2 = 28
	//n = 9 �̸� : 9C6 = 9 * 8 * 7 / 3 * 2 * 1 = 504 / 6 = 84
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] arr;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			if(n < 7) break;

			arr = new int[n];
			for(int i=0 ; st.hasMoreTokens() ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			lotto(arr, n, arr.length - 6);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void lotto(int[] arr, int n, int m) {
		
	}
	
	public static void printNumber() {
		
	}
}
