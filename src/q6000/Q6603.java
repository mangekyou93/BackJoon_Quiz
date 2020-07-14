package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6603 {

	//���� ���� 6603 : �ζ�
	//�з� : �Թ���, BFS, DFS, ���Ʈ ����, ��Ʈ��ŷ
	static StringBuilder sb = new StringBuilder();
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			if(n < 7) break;

			arr = new int[n];
			for(int i=0 ; st.hasMoreTokens() ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			lotto();
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void lotto() {
		
	}
	
	public static void printNumber() {
		
	}
}
