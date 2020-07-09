package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5032 {

	//���� ���� 5032 : ź�� ����
	//�з� : ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int count = 0;
		int d = e+f;
		
		
		//�ð� �ʰ� d > 2��� �ؼ� �ð� �ʰ� ����
		while(d >= c) {
			int a = d/c;
			int b = d%c;
			count += a;
			d = a+b;
		}
		
		System.out.println(count);
	}
	
}
