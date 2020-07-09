package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1592 {
	
	//���� ���� 1592 : �����̿� ģ����
	//�з� : ��Ŭ���� ȣ����
	public static void main(String[] args) throws Exception{
		
		//3 1 1 : 0��
		//3 2 1 : 3��
		//3 3 1 : 6��
		//3 4 1 : 9��
		
		//3 1 2 : 0��
		//3 2 2 : 3��
		//3 3 2 : 6��
		//3 4 2 : 9��
		
		//4 1 1 : 0��
		//4 2 1 : 4��
		//4 3 1 : 8��
		//4 4 1 : 12��
		
		//4 1 2 : 0��
		//4 2 2 : 2��
		//4 3 2 : 4��
		//4 4 2 : 6��
		
		//4 1 3 : 0��
		//4 2 3 : 4��
		//4 3 3 : 8��
		//4 4 3 : 12��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		arr[0] = 1;
		
		int NLgcd = gcd(N, L);
		if(NLgcd == 1) {
			System.out.println(N * (M-1));
		}else {
			System.out.println(NLgcd * (M-1));
		}
		
	}
	
	public static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
}
