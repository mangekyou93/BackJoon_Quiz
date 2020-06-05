package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10989 {

	//���� ���� 10989 : �� �����ϱ� 3
	//ī���� �����̶�� �� ��� : ���ڰ� �ߺ��� �� �迭�� �ε��� == ����
	//�ε��� 4�� �迭�� 5���� arr[4] = 5 �̹Ƿ� ���Ľ� ~ 4 4 4 4 4 ~		<-- �̷������� ���� ����
	//�ð����⵵ : O(N+K), K�� �ڸ���
	//�����Ͱ� ������ ���� ���� O(N)�� �����⶧���� O(N)�̶�� �� �� ����.
	
	//�޸� : 446MB / �ð� : 1.532 s
	public static void main(String[] args) throws Exception{
		
		int[] cnt = new int[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1 ; i<cnt.length ; i++) {
			
			//�������� �ߺ��� ���� �ֱ� ������
			//ī��Ʈ�� �� 1�� �ִ� ���� �ƴϹǷ�
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}

}
