package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1475 {

	//���� ���� 1475 : �� ��ȣ
	//�з� : ���ڿ� ó��
	//���� �ǰ� �̼���..
	//���� �� ���� �ߴµ� ���� �̼�����??
	static int[] su = new int[10];
	static int N;
	
	static int getRoomNum() {
		if(N == 0) return 1;
		
		int count = 0;
		while(N > 0) {
			int a = N%10;
			N /= 10;
			if(a == 9 || a == 6) {
				count++;
				continue;
			}
			su[a]++;
		}
		
		count = count%2 < 1 ? count/2 : count/2+1;
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<su.length ; i++) {
			if(max < su[i]) {
				max = su[i];
			}
		}
		
		if(max > count) {
			return max;
		} else {
			return count;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		System.out.println(getRoomNum());
	}
	
}
