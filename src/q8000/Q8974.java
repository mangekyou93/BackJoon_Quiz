package q8000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8974 {
	
	//���� ���� 8974 : ������ ���н���
	//�з� : �ݺ���
	
	//���� ���ص� ����
	//������ ����
	//�����Ѱ� ���� �ʹ� ����...
	//�׸��� �ϴ� �������� �� �޸𸮰� �ڽð� ���α׷��� �ϴ� ���ƾ���...
	//�� �Ŀ� �ð� ������ ���� üũ�ϵ��� �ϸ� ��
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[1001];
		int count = 0;
		int a = 1;
		
		for(int i=1 ; i<1001 ; ) {
			count = a;
			while(count-- > 0) {
				arr[i] = a;
				i++;
				
				if(i == 1001) break;
			}
			a++;
		}

		int sum = 0;
		for(int i=A ; i<=B ; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
