package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2193 {

	//���� ���� 2193 : ��ģ��
	//�޸� : 13MB / �ð� : 0.080 s
	
	//�� ���� ���ϴ� ���̶� �Ǻ���ġ ���� ���ϴ� ����
	//�Ǻ���ġ ������ ���� Ŀ���� N <= 90�̸� long�� �����
	//���� �� ���� ���̸� �Ǻ���ġ�� Ǯ �� ����..
	static long[] dp = new long[91];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		
		System.out.println(f(N));
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = f(n-1) + f(n-2);
		dp[n] = result;
		return result;
	}
}
