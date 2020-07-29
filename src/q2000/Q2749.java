package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2749 {

	//���� ���� 2749 : �Ǻ���ġ �� 3
	//�޸� : 25MB / �ð� : 0.116 s
	
	//�Ǻ���ġ ���� �Ӽ��� �˾ƾ��� Ǯ �� �ִ� ����...
	//�Ǻ���ġ�� �Ӽ�
	//1. �ǻ�� �ֱ� : �Ǻ���ġ ���� K�� ���� �������� �׻� �ֱ⸦ ������. (�Ǻ���ġ ���� 3���� �������� ��, �ֱ��� ���̴� 8)
	//2. �ֱ��� ���̰� P�̸�, N��° �Ǻ���ġ ���� M���� ���� �������� N%P��° �Ǻ���ġ ���� M�� ���� �������� ����. (1000%8 = 0��° �Ǻ���ġ ���� M���� ���� �������� ����.)
	//3. M = 10^k�� ��, k > 2���, �ֱ�� �׻� 15 * 10^(k-1)�̴�.
	
	//d�� 1000000�̹Ƿ� 10^6 -> �ֱ�� �׻� 15 * 10^5 = 1500000	:: �Ǻ���ġ�� �Ӽ� 3
	static int d = 1000000;
	static long[] fibo = new long[1500000];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2 ; i<1500000 ; i++) {
			fibo[i] = (fibo[i-1] + fibo[i-2]) % d;
		}
		
		if(n >= 1500000) {
			n %= 1500000;
		}
		
		System.out.println(fibo[(int)n]);
		
	}
}
