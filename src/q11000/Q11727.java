package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11727 {

	//���� ���� 11727 : 2xn Ÿ�ϸ� 2
	//�޸� : 13MB / �ð� : 0.080 s
	
	//�Ǻ���ġ ����(?) ����
	//2*f(n-2) + f(n-1)
	
	//�̷� ���� ������ Ʋ���� ����..
	//�� 2^n - f(n-1)�� �ߴµ�
	//n == 62���� �Ȱ���....
	//63���� 7937 , 7936���� �޶���...
	static long[] dp = new long[1001];
	//static long[] dp2 = new long[1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 3;
		//dp2[1] = 1;
		//dp2[2] = 3;
		
		System.out.println(f(N) % 10007);
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = (2*f(n-2) + f(n-1)) % 10007;
		dp[n] = result;
		return result;
	}
	
	/*
	public static long f2(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp2[n] != 0) return dp2[n];
		
		long result = (long)Math.pow(2, n) - f2(n-1);
		dp2[n] = result;
		return result;
	}
	*/
}
