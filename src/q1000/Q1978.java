package q1000;

import java.util.Scanner;

public class Q1978 {

	//���� ���� 1978 : �Ҽ� ã��
	//�Ҽ�(Prime Number)��, ����� 1�� �ڱ��ڽŸ� ���� �� ex) 2, 3, 5, 7, 11, ...
	//�Ҽ��� �߿��� ������ "��ȣ" �����̶�� �Ѵ�.
	//'RSA ��ȣȭ ���' : ������ ������ ���� ���ϱ� ������ ������ ���μ� �����ϴ� ���� ��ƴ�.
	//��� 1 : 2�̻� N�̸��� �ڿ����� ������. 		==> �ð����⵵ O(N)		:: N������ ��� �Ҽ��� ���ϴ� ��� 		==> �ð����⵵ O(N^2)
	//��� 2 : ��N������ �ڿ����ε�θ� ������ ���	==> �ð����⵵ O(��N)	:: N������ ��� �Ҽ��� ���ϴ� ���		==> �ð����⵵ O(N��N)
	//��� 3 : �����佺�׳׽��� ü				==> �ð����⵵ O(NlogN)	:: N������ ��� �Ҽ��� ���ϴ� ���		==> �ð����⵵ O(Nlog(logN))
	//�����佺�׳׽��� ü��, k=2���� ��N���ϱ��� �ݺ��Ͽ� �ڿ����� �� k�� ������ k�� ����� �� ���ܽ�Ų��.
	
	//��Ÿ�ӿ����� �ߴ� ������ �Է� ���� �� �ѹ��� �ް� �ȹް� �����ΰ� ������ ¥������ Scanner�� ���
	//�Ҽ� ������ ��� ���ÿ����̿��� �����佺�׳׽��� ü�� ���� ���� ����ϱ�� ��.
	//�ϴ� ���1�� Ǯ����
	public static void main(String[] args) {
		
		//��� 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0 ; i<n ; i++) {
			int number = sc.nextInt();
			
			if(isPrime(number)) count++;
		}
		
		System.out.println(count);
		sc.close();
	}
	
	public static boolean isPrime(int number) {
		
		if(number < 2) return false;
		if(number == 2) return true;
		if(number == 3) return true;
		
		for(int i=2 ; i<number ; i++) {
			if(number % i == 0) return false;
		}
		return true;
	}

}
