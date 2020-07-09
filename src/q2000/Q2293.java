package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2293 {

	//���� ���� 2293 : ���� 1
	//�з� : ���̳��� ���α׷���
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		int[] dp = new int[k+1];
		
		for(int i=0 ; i<n ; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		
		//2, 1, 3 �̶�� �� ��
		//2�� 0 1 0 1 0 1 0
		//1�� 1 2 2 3 3 4 4 
		//3�� 1 2 3 4 5 7 8 
		
		//������� 2�� �������� �� �����,
		//�� ���� 1�� �������� 2�� ���� ���� + 1�� ���� ���� = dp[]
		//������ 3�� �������� (2�� ���� ���� + 1�� ���� ����) + 3�� ���� ���� = dp[]
		//�� ����� ���� �ϼ��ȴ�.
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<k+1 ; j++) {
				if(j >= coin[i]) {
					dp[j] = dp[j] + dp[j-coin[i]];
				}
			}
		}
		
		System.out.println(dp[k]);
	}
	
}
