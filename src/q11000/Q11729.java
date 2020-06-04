package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11729 {

	//���� ���� 11729 : �ϳ��� ž �̵� ����
	//�ϳ��� ������ ��ǥ���� ��������(divide-and-conquer) ����
	//�޸� 98MB / �ð� 0.34 s
	//����Լ��� �ð��� ���� �Ҹ��.
	static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws Exception{

		//1 -> 1
		//2 -> 3
		//3 -> 7
		//4 -> 15
		//5 -> 31
		//2^n  - 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int k = (int)(Math.pow(2, n)) - 1;
		sb.append(k+"\n");
		
		//n�� ž�� �� �� / 1,2,3�� ������ ��ġ.
		//1 -> 3���� �̵��ϴ� ���� ���Ѵ�.
		hanoi(n,1,2,3);
		
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int from, int by, int to) {
		if(n == 1) {
			sb.append(from+" "+to+"\n");
			return ;
		}
		hanoi(n-1,from,to,by);
		sb.append(from+" "+to+"\n");
		hanoi(n-1,by,from,to);
	}

}
