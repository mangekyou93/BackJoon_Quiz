package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2581 {

	//���� ���� 2581 : �Ҽ�
	//��� 2 : ��N������ �ڿ����ε�θ� ������ ���	==> �ð����⵵ O(��N)	:: N������ ��� �Ҽ��� ���ϴ� ���		==> �ð����⵵ O(N��N)
	//��� 3 : �����佺�׳׽��� ü				==> �ð����⵵ O(NlogN)	:: N������ ��� �Ҽ��� ���ϴ� ���		==> �ð����⵵ O(Nlog(logN))
	
	//�����佺�׳׽��� ü�� ���ڿ� �ٷ궧ó�� boolean �迭�� ����Ѵ�.
	public static void main(String[] args) throws Exception{
		
		//���2�� �ð� �ʰ� ���´�..
		//method2();
		
		//���3 : �����佺�׳׽��� ü
		method3();
	}
	
	public static void method3() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[n+1];							//0~n�����ϱ� +1�� ���ش�
		prime[0] = true;											//0�� �Ҽ��� �ƴϴ� : true �Ҽ��� �ƴ� ��
		prime[1] = true;											//1�� �Ҽ��� �ƴϴ� : true �Ҽ��� �ƴ� ��
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {			//i = 2�̸� 4 6 8 10.... 2�� ��� ���� �Ҽ��� �ƴ� ��(true)�� ����
				prime[j] = true;									
			}
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) {	// false = �Ҽ� 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// ù �Ҽ��� �ּڰ���  
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	public static void method2() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int min = 10001;
		int sum = 0;
		
		while(m<=n) {
			boolean check = true;
			
			if(m == 1) continue;
			
			for(int i=2 ; i<=Math.sqrt(m) ; i++) {
				if(m % i == 0) {
					check = false;
					break;
				}
			}
			
			if(check) {
				if(m < min) {
					min = m;
				}
				sum += m;
			}
			m++;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
