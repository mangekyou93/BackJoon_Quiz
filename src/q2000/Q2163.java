package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2163 {

	//���� ���� 2163 : ���ݸ� �ڸ���
	//�з� : ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println((Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())) - 1);
		
	}
	
}
