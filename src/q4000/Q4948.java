package q4000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {

	//���� ���� 4948 : ����Ʈ�� ����
	//����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
	//�޸� : 27MB / �ð� : 0.156 s
	//�޸�
	//1. boolean[]�� ��� ���� ���� ������ ��
	//2. n�� ������ 123456�̹Ƿ� ó�� ���� �� 246912 + 1�� ����� �� �� ���� ������ ��
	//1,2�� ��� �غ��� 27MB -> 15MB�� ����	--> ���� �ڵ� ������ �޸� �Ҵ��� ��� �ؾߵǴ� ������ �ƴ����� �� �ľ��ؾ��Ѵ�.
	
	//�ð�
	//1. �Ҽ� �Ǻ��� ó�� prime�迭 �ʱ�ȭ �� ���ش�
	//2. BufferedWriter, OutputStreamWrtier ���� StringBuilder�� ��������� �� ���� ��
	//�� ���� ����... �� ������ ��� �ð��� �޶���..
	public static void main(String[] args) throws Exception {
		boolean[] prime = new boolean[246913];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<= Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue;
			for(int j=i*i ; j<prime.length ; j += i) {
				prime[j] = true;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			} else if(n == 1) {
				sb.append("1\n");
				//bw.append("1\n");
			} else {
				//boolean[] prime = new boolean[2 * n + 1];
				/*
				prime[0] = true;
				prime[1] = true;
				
				for(int i=2 ; i<= Math.sqrt(prime.length) ; i++) {
					if(prime[i]) continue;
					for(int j=i*i ; j<prime.length ; j += i) {
						prime[j] = true;
					}
				}
				*/
				int count = 0;
				
				for(int i=n+1 ; i<2*n ; i++) {
					if(!prime[i]) count++;
				}
				sb.append(count+"\n");
				//bw.append(count+"\n");
			}
		}
		System.out.println(sb);
		//bw.flush();
		//bw.close();
		br.close();
	}
}
