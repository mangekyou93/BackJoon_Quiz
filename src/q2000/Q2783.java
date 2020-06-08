package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2783 {

	//���� ���� 2783 : �ﰢ ���
	//�з� : �ݺ���
	//�ּҰ� ���ϴ� ����
	//�ٵ� ���� �ʹ� ��â��..
	//�̷��ſ� �ͼ��������� ���� �ȹٷ� �а� ��������
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double value = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double a = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken());
			
			if(a < value) {
				value = a;
			}
		}
		
		System.out.printf("%.2f", value*1000);
	}

}
