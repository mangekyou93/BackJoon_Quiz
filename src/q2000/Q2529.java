package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2529 {

	//���� ���� 2529 : �ε�ȣ
	//�з� : �׸��� �˰���
	
	//����� ������... ������ �н� (2020-06-15)
	static boolean[] su;
	static String[] sign;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		sign = br.readLine().split(" ");
		
		simbol(k);
		
		//1���� �Ʒ��������� �ö󰡸鼭 ã���� ���� ���� ��
		//1���� ���������� ���ο��鼭 ã���� ���� ū ��
		//�� ���� ������??
		
	}
	
	public static void simbol(int n) {
		su = new boolean[10];
		String s = "";
		for(int i=0 ; i<su.length ; i++) {
			for(int j=i+1 ; j<su.length ; j++) {
				for(int k=0 ; k<sign.length ; k++) {
					if(sign[k].equals("<")) {
						if(i < j) {
							su[i] = true;
							su[j] = true;
						}
					}else {
						if(i > j) {
							su[i] = true;
							su[j] = true;
						}
					}
				}
			}
		}
	}
	
}
