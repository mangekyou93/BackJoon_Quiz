package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	//���� ���� 1449 : ������ �׽�
	//�з� : �׸��� �˰���
	
	
	//���̰� 2�� ��������
	//5�� 4 5 6 7 8�� ���´ٰ� �ϸ�
	//0.5�� �߰��� ���ƾ��ϴϱ�
	//3.5 ~ 5.5		: 1��
	//5.5 ~ 7.5		: 2��
	//7.5 ~ 9.5		: 3��
	//�̷��� ����ϴ°� �ƴѰ�??
	
	//Ǯ��
	//3.5 ~ 5.5		: 1��		5.5���� ���Ҵµ� 6�� �����Ѵ�.
	//6.5 ~ 8.5		: 2��
	
	//���ذ� �ȵ�
	//��� �� ��ġ�� �¿� 0.5��ŭ ������ ��� ���� �ٽô� �� ���ٰ� �����Ѵ�.	:	���� ���°��� 6�ε� 5.5�� 6.5�� ���Ƶ� 6���� ���� �Ȼ��ٴ� ���ΰ�..?
	//�� �� ���� 6���� ���� 5.5 ~ 6.5�� ���ƾ� 6���� ���� �Ȼ��ٴ°� �ƴ�?
	//������ ��������ٰ� �����ϸ� 6���� �������� �ʴµ� ����?
	//�� ���Ҹ���?
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] leak = new int[N];
		for(int i=0 ; i<N ; i++) {
			leak[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(leak);
		
		int range = (int)(leak[0] - 0.5 + L);
		int tape = 1;
		
		for(int i=1 ; i<leak.length ; i++) {
			
			if(range < (int)(leak[i] - 0.5)) {
				range = (int)(leak[i] - 0.5 + L);
				tape++;
			}
				
		}
		
		System.out.println(tape);
		
	}
}
