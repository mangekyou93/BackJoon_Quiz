package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {

	//���� ���� 1011 : Fly me to the Alpha Centauri
	//������ ������� ������ ���� �þ�����.
	//���й����� ���� ��Ģ�� ã�� ���� �߿��ϴ�	->	�׷��� ��å���� ��� ��Ģ�� ã��.
	//�ݺ����� ����ϵ� �ظ��ϸ� ������� �ʾƾ� �ӵ��� �� ���´�.
	public static void main(String[] args) throws Exception {
		
		//0 -> 1  : 1			(1��)
		//0 -> 2  : 1 1			(2��)
		//0 -> 3  : 1 1 1		(3��)
		//0 -> 4  : 1 2 1		(3��)
		//0 -> 5  : 1 2 1 1		(4��)
		//0 -> 6  : 1 2 2 1		(4��)
		//0 -> 7  : 1 2 2 1 1	(5��)
		//0 -> 8  : 1 2 2 2 1	(5��)
		//0 -> 9  : 1 2 3 2 1	(5��)
		//0 -> 10 : 1 2 3 2 1 1	(6��)
		//0 -> 11 : 1 2 3 2 2 1	(6��)
		//0 -> 12 : 1 2 3 3 2 1 (6��)
		//.
		//.
		//.
		//��Ģ�� ã�ٺ��� 4, 9, 16, ... ���� max�� �ٲ�� /ī��Ʈ Ƚ ���� �б����� ��.
		//��Ģ�� ���� ã��!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dis = y - x;
			
			int max = (int)Math.sqrt(dis);
			
			if(max == Math.sqrt(dis)) {
				sb.append(max * 2 - 1);
			} else if(dis <= max * max + max) {
				sb.append(max * 2);
			} else {
				sb.append(max * 2 + 1);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
