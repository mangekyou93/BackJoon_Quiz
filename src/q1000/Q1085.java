package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {

	//���� ���� 1085 : ���簢������ Ż��
	//���� �����ӿ��� 2�� Ʋ��...
	//������ Ȯ���ϰ� ��������!
	//���׽��� ���� ����ϴ� ���� �����ɱ�?
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int a = w - x < x - 0 ? w - x : x - 0;
		int b = h - y < y - 0 ? h - y : y - 0;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		if(b>a) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}

}
