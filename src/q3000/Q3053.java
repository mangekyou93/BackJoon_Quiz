package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3053 {

	//���� ���� 3053 : �ý� ������
	//���� ���� : ��r^2 , ���� �ѷ� : 2��r ,  ���� �ѳ��� : 4��r^2 , ���� ���� : 4/3��r^3
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		System.out.printf("%.6f", r*r*Math.PI);
		System.out.println();
		System.out.printf("%.6f", (double)2*r*r);
		
		br.close();
	}

}
