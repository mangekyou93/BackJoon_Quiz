package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2875 {

	//���� ���� 2875 : ��ȸ or ����
	//�з� : �׸��� �˰���
	
	//Ǯ����..
	//��¥ �ϸ� �� �� ��������!!!!!
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());			//���л��� ��
		int M = Integer.parseInt(st.nextToken());			//���л��� ��
		int K = Integer.parseInt(st.nextToken());			//���Ͻ��� �����ؾ��� �л��� ��
		
		while(K > 0) {
			if(N >= M*2) {
				N--;
				K--;
			} else {
				M--;
				K--;
			}
		}
		
		int count = 0;
		while(M > 0 && N > 1) {
			N -= 2;
			M--;
			count++;
		}
		
		System.out.println(count);
		
	}
	
}
