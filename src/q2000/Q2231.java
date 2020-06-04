package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2231 {

	//���� ���� 2231 : ������
	//���Ʈ����
	//�� �ڸ����� ���� ���ƴ�...
	//0���� ���� �����ڸ� ã���鼭 ã���� break�� �����߾��µ�...
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0 ; i<N ; i++) {
			int number = i;
			int sum = 0;
			
			//�̰� �� �˾Ƴ���...
			//�� �ڸ� ���� ���� ���ϴ� while��
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
