package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

	//���� ���� 1929 : �Ҽ� ���ϱ�
	//���������� prime�� ���غ� ����
	//�����佺�׳׽��� ü�� ���� ���� for���� ���� ����� �������� ����.
	//���������� prime�� ���ϸ� �ణ ����.
	//������ �޼���� ������ �������� ��û ���ϴ�.
	static boolean[] prime = new boolean[1000001];
	
	public static void main(String[] args) throws Exception {
		
		//�޸� : 26MB / �ð� : 0.192 s
		getPrime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m ; i<=n ; i++) {
			if(!prime[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
		br.close();
		
		/*
		//�޸� : 28MB / �ð� : 0.2 s
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//�����佺�׳׽��� ü : �Ҽ� ã��
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for( int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m ; i<=n ; i++) {
			if(!prime[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
		br.close();
		*/
	}
	
	static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for( int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
	}

}
