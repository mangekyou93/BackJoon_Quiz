package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9020 {

	//���� ���� 9020 : �������� ����
	//�޸� : 46MB / �ð� : 0.368 s			:: �ð��� ���� ����
	public static void main(String[] args) throws Exception {

		//���⼭ �߿��� ����Ʈ�� ���� ������ �������� ��� �� �Ҽ��� ���� ���� ���� ����϶�� �ߴ�.
		//�޸� : 15MB / �ð� : 0.116 s			:: Ȯ���� ����, ������ first_patition, second_partition 2���� ���� �޸𸮵� ����
		strangerCoding();
		
		//�� �ҽ�
		//�޸� : 46MB / �ð� : 0.368 s			:: �ð��� ���� ����	=	if���� ����, ��ü ��ȸ�� �ؾ��ؼ�
		//myCoding();
		
	}
	
	public static void strangerCoding() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//�����佺�׳׽��� ü
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {							//�̷��Ե� �� �� �ִٴ°� ���� �ű���..
			int n = Integer.parseInt(br.readLine());
			int first_partition = n / 2;
			int second_partition = n / 2;
			
			while(true) {
				//n=12�̸�
				//6+6 = 12		false,	���� 0	:: x
				//5+7 = 12		true, 	���� 2	:: o
				//4+8 = 12		false,	���� 4	:: x
				//3+9 = 12		false,	���� 6	:: x
				//2+10= 12		false,	���� 8	:: x
				//�� ��Ƽ���� ��� �Ҽ� �� ���
				if(!prime[first_partition] && !prime[second_partition]) {
					sb.append(first_partition).append(" ").append(second_partition).append("\n");
					break;
				}
				first_partition--;
				second_partition++;
			}
		}
		System.out.println(sb);
		br.close();
	}
	
	public static void myCoding() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//�����佺�׳׽��� ü
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			String s = "";
			
			for(int j=2 ; j<n ; j++) {
				if(!prime[j]) {
					if(n - j > 1) {
						a = n - j;
						if(a-j >= 0 && !prime[a]) {
							s = j+" "+a;
						}
					}
				}
			}
			sb.append(s+"\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
