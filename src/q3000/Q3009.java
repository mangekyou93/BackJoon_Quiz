package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3009 {

	
	//���� ���� 3009 : �� ��° ��
	//���δ� �ܼ��ϰ� ��������...
	//�̷� ������ ��� �����ִ°Ŵϱ� �ð��� ������������ �׳� ������ Ǯ�� �Ѿ���Ѵ�
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
		
		String x = "";
		String y = "";
		
		if(a[0].equals(b[0])) {
			x = c[0];
		} else if(a[0].equals(c[0])) {
			x = b[0];
		} else {
			x = a[0];
		}
		
		if(a[1].equals(b[1])) {
			y = c[1];
		} else if(a[1].equals(c[1])) {
			y = b[1];
		} else {
			y = a[1];
		}
		
		System.out.println(x+" "+y);
	}

}
