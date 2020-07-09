package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q11051 {

	//���� ���� 11051 : ���� ��� 2
	static int[][] dp = new int[1001][1001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(pascal(a,b));
		
		/*
		//BigInteger�� ���ڰ� ���ϱ޼������� Ŀ���� �޸� �ʰ��� ���� �߻��� ��
		BigInteger bi = new BigInteger("1");
		BigInteger bi2 = new BigInteger("1");
		
		
		if(a == b) {
			System.out.println(1);
		}else {
			for(int i=a ; i>b ; i--) {
				bi = bi.multiply(new BigInteger(i+""));
			}
			
			for(int i=1 ; i<=a-b ; i++) {
				bi2 = bi2.multiply(new BigInteger(i+""));
			}
			bi = bi.divide(bi2);
			bi = bi.remainder(new BigInteger("10007"));
			
			System.out.println(bi);
		}
		*/
	}
	
	//�Ľ�Į�� �ﰢ���� �̿��ؼ� Ǯ ���� �ִ�.
	//dp ����
	//5C2 = 4C1 + 4C2�� ���ؼ� ���ϸ� �ȴ�.
	//4C1 = 3C0 + 3C1, 4C2 = 3C1 + 3C2
	//�̷������� �۰� �����ؼ� Ǯ�� ��.
	public static int pascal(int a, int b) {
		if(a == b || b == 0) return 1;
		if(dp[a][b] > 0) return dp[a][b];
		
		//5C2    =       4C1        +      4C2
		dp[a][b] = pascal(a-1, b-1) + pascal(a-1, b);			//�̰� ��ȭ��, ��ȭ���� ���ϴ� ������ ���̳������α׷��ֿ��� ���� �߿���.
		
		return dp[a][b]%10007;
	}
}
