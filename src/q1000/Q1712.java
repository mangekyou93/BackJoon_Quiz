package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

	//���� ���� 1712 : ���ͺб���
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int cost = a+b;
		int count = 0;
		
		if(b >= c) {
			count = -1;
		} else {
			count = a / (c - b) + 1;
			/*
			//�ݺ����� �ð��� �� �ҿ�ȴ�
			//�̰Ŵ� 0.35�ʰ� �ʰ��ȴ�... �׷��� ���а� �����ű���....
			while(cost > 0) {
				cost = cost + b - c;
				count++;
			}
			*/
		}
		
		System.out.println(count);
	}
}
