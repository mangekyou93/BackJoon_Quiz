package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2960 {

	//���� ���� 2960 : �����佺�׳׽��� ü
	//�з� : ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[N+1];
		int index = 0;
		
		//for(int i=2 ; i<N ; i++) { �� ������
		for(int i=2 ; i<N+1 ; i++) {
			for(int j=i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
				System.out.println(j);
				K--;
				if(K == 0) index = j;
			}
		}
		
		System.out.println(index);
	}
}
