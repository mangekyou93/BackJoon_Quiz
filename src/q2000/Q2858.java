package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2858 {

	//���� ���� 2858 : ����� �ٴ�
	//�з� : ���Ʈ ����
	
	//�������� ��Ģ�� ã�ƾ��ϴµ� �� ��ã��...
	//���� �����ؾ���.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int L = 0;
		int W = 0;
		
		int sum = R + B;
		
		//sum == L * W == R + B;
		
		for(int i=1 ; i<R ; i++) {
			for(int j=1 ; j<R ; j++) {
				if(i * 2 + ((j - 2) * 2) == R && (i - 2) * (j - 2) == B) {
					L = i;
					W = j;
				}
			}
		}
		
		System.out.println(L+" "+W);
		
	}
}
