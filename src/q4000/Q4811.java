package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q4811 {

	//���� ���� 4811 : �˾�
	//�з� : ��� ȣ��
	
	//2020-06-17 ����
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		
		while((N = Integer.parseInt(br.readLine())) != 0) {
			count = 0;
			pillString(N, 0);
			System.out.println(count);
		}
	}
	
	public static void pillString(int W, int H) {
		
	}
}
