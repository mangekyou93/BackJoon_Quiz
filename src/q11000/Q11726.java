package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11726 {

	//���� ���� 11726 : 2xn Ÿ�ϸ�
	//�޸� : 13MB / �ð� : 0.080 s
	
	//�̰͵� �Ǻ���ġ ���� ����
	//��, dp[2] = 2
	static long[] dp = new long[1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.println(f(N) % 10007);
	}
	
	public static long f(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(dp[n] != 0) return dp[n];
		
		long result = (f(n-1) + f(n-2)) % 10007;
		dp[n] = result;
		return result;
	}
}
