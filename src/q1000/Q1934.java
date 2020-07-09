package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {
	
	//���� ���� 1934 : �ּ� �����
	//�з� : ��Ŭ���� ȣ����
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int gcd = gcd(A, B);
			
			sb.append((A*B)/gcd).append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	public static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
}
