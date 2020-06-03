package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {

	//���� ���� 1002 : �ͷ�
	//������ ���� ������...
	//A -> C : r1 , A�� ��ġ(x1,y1)
	//B -> C : r2 , B�� ��ġ(x2,y2)
	//�������� r1�� ��a�� �������� r2�� ��b�� ������ ������ ���ϴ� ��
	//���� ���ε� �ʿ��ϳ�...
	//��� ������ Ǯ�鼭 ������ ���� ������ ���ذ� �ȵ�.
	//���� Ǯ�̴� ���ذ� ��.
	
	//1. r1=r2, �߽��� ���� ��					: ������ ������ ���Ѵ�
	//2. �� �� ������ �Ÿ��� �� ���� �������� �պ��� Ŭ ��	: ������ ����
	//3. ū �� �ȿ� ���� ���� �����鼭 ������ ���� ��		: ������ ����
	//4. ������ ��								: ������ 1��
	//5. ������ ��								: ������ 1��
	//6. ������								: ������ 2��
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			//Math.sqrt�� ���ϴ� ������ double, float���� ���Ҽ� �κп��� 0.1 + 0.2 != 0.3 ������(��Ʈ �κ�)
			//�׳� ������ �̿��ؼ� Ǭ��.
			int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			//1. r1=r2, �߽��� ���� ��					: ������ ������ ���Ѵ�
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				sb.append(-1).append("\n");
			}
			//2. �� �� ������ �Ÿ��� �� ���� �������� �պ��� Ŭ ��	: ������ ����
			else if(distance_pow > Math.pow(r1 + r2,2)) {
				sb.append(0).append("\n");
			}
			//3. ū �� �ȿ� ���� ���� �����鼭 ������ ���� ��		: ������ ����
			else if(distance_pow < Math.pow(r2 - r1,2)) {		//�����̶� �������͵� ��� ����
				sb.append(0).append("\n");
			}
			//4. ������ ��								: ������ 1��
			else if(distance_pow == Math.pow(r2 - r1,2)) {
				sb.append(1).append("\n");
			}
			//5. ������ ��								: ������ 1��
			else if(distance_pow == Math.pow(r2 + r1,2)) {
				sb.append(1).append("\n");
			}
			//6. ������								: ������ 2��
			else {
				sb.append(2).append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
