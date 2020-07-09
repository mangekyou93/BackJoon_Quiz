package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1722 {

	//���� ���� 1722 : ������ ����
	//�з� : ����
	//���� : permutation
	static int N;
	static long[] arr;
	
	static long factorial(long i) {
		if(i == 1) return 1;
		return i * factorial(i - 1);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken());
		int len = st.countTokens();
		arr = new long[len];
		for(int i=0 ; i<len ; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		if(k == 1) {
			getPermutation();
		} else {
			getOrder();
		}
	}
	
	static void getPermutation() {
		long d = factorial(N-1);
		long x = arr[0];
		int a = (int)((x-1)/d) + 1;		//ù ��°
		d = factorial(N-2);
		
		System.out.println(a);
		
	}
	
	static void getOrder() {
		
	}
}
