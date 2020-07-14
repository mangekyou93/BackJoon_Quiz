package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	//���� ���� 1449 : ������ �׽�
	//�з� : �׸��� �˰���
	//�޸� : 13MB / �ð� : 0.084 s
	
	//���� �����Ѱ� �¾���
	//6���� ���µ� 5.5�� 6.5�� ���°� ���� �ȵǴµ�...
	//3.5 ~ 5.5
	//6.5 ~ 8.5
	//�̰� Ʋ������
	
	//5 2
	//4 5 6 7 8�� 3���� �ʿ��Ѱ� ����		::	2���� ����� ���� �� ����
	//3.5 ~ 5.5
	//5.5 ~ 7.5
	//7.5 ~ 9.5
	//�̷��� ���°� ����
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
		
		int range = leak[0];
		int tape = 1;
		
		for(int i=1 ; i<leak.length ; i++) {
			
			if(range + L - 1 < leak[i]) {			// i == 1 �϶�, ù��° ���� �������� 4 + 2(����������) - 1(�� �� 0.5�� �ʿ��ϴϱ�) = 5
				range = leak[i];					// 5 < leak[2]�̴ϱ� range = leak[2] = 6
				tape++;								
			}
				
		}
		
		System.out.println(tape);
		
	}
}
