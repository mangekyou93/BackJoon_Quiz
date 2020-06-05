package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2108 {

	//���� ���� 2108 : �����
	//�ֺ�, �߾Ӱ��� ������ ����..
	//�̰͵� ī���� ������ �̿��ؼ� ������ �ذ�
	//�̷� �迭�� ���� ���δ�. boolean[]���� �ϱ⵵ �ϰ�, int[]�� �ϱ⵵ ��
	public static void main(String[] args) throws Exception{
		
		//������ : N���� ������ ���� N���� ���� ��
		//�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		//�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
		//���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sAvg = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];
		
		for(int i=0 ; i<n ; i++) {
			int value = Integer.parseInt(br.readLine());
			sAvg += value;
			arr[value + 4000]++;
			
			if(value < min) {
				min = value;
			}
			if(value > max) {
				max = value;
			}
		}
		
		
		int median = 10000;
		int mode = 10000;
		boolean flag = false;
		
		int count = 0;
		int mode_max = 0;
		
		for(int i=min+4000 ; i<=max+4000 ; i++) {
			
			//ī��Ʈ�� 0 �� �� ����
			//ex) -3 -1�̸� arr[3998] == 0 �̱� ������ if�� ������� ����
			if(arr[i] > 0) {
				//�߾Ӱ� ã��
				//-1 -1 -1 -1 0 1 1 1 1
				if(count < (n+1) / 2) {
					count += arr[i];
					median = i - 4000;
				}
				
				
				//�ֹݰ� ã�� 
				// ex) -4 -3 -3 -2 -1 -1 1 1
				// -1���� flag�� false�� �ǰ�,
				// 1������ if���� ������� �ʴ´�.
				// ex) -4 -3 -3 -2 -1 -1 1 1 1
				// �� ���� 1���� flag�� �ٽ� true�� �� �Ŀ��� �ֺ� ������ �����ϴ� ���� ���̻� ����.
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// ù �����̹Ƿ� true �� ���� 
				}
				// ���� �ֺ� �ִ񰪰� ������ ���鼭 �� ���� �ߺ��Ǵ� ���
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		sb.append((int)Math.round((double)sAvg/n)).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max - min);
		System.out.println(sb);
	}

}
