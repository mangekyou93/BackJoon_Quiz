package q15000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {

	//���� ���� 15649 : N�� M (1)
	//�޸� : 55MB / �ð� : 0.216 s
	//��Ʈ��ŷ �Թ�
	//��Ʈ��ŷ�̶�, '������ ��� ����� Ž���Ѵ�.' ��ǥ���� ���� Ž�� ������δ� DFS(Depth First Search, ���� �켱 Ž��)�� �ִ�.
	//DFS�� ���� �������� �湮�� ���� ������ ��� ȣ���� �̿��ؼ� ��� �̵��Ѵ�.
	//DFS �� ������ ������ ���� ���� ã�ƾ��Ҷ� ȿ�����̴�.
	//������ DFS �� ������ �湮�ϱ� ������ ���� ��ǥ������ ���� �ʴ� ��η� ������ ��ȿ������ ����� �ʷ��Ҽ��� �ִ�.
	//���� Ž������ �ٸ� �� : ��� ���ǿ� �ɸ��� ���ϸ�, �� �����ϴ� Ž���̶�
	
	//�ʹ� ����� ���̴�...
	//for�� �ȿ� ��Ͷ��
	//��͸� ����ϸ� �ݵ�� ������ ������ �־�ߵȴٴ� �� ������, ������ �ƿ� ���ϰ���..
	static StringBuilder sb = new StringBuilder();
	static int[] check, list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		check = new int[9];
		list = new int[9];

		sequence(n, m, 0);
		
		System.out.println(sb);
	}
	
	public static void sequence(int n, int m, int cnt) {
		
		if(cnt == m) {	// 0���� M������ �ݺ������� �ϳ��� ó���� �ϼ�
			
						// �������� �������δ� �̺κ��� ��Ʈ��ŷ�� �ش��Ѵٰ� �����Ѵ�.
            // M���� ū Ƚ���� ������� �ʰ� �����Ѵ�.
			for(int i=0;i<m;i++) { // ���� ����迭�� ���
				sb.append(list[i]+" ");
			}
			sb.append("\n");
			return; // DFS ���� 
		}
		
		
		for(int i=1 ; i<=n ; i++) {
			
			if(check[i] == 1) continue;
			check[i] = 1;
			list[cnt] = i;					// ���� �ݺ�Ƚ���� �ش��ϴ� �迭�� i���� �ִ´�.
			sequence(n, m, cnt+1);			// �ݺ�Ƚ���� ������Ų��.
			check[i] = 0;					// dfs�� ���� �Ŀ��� �ٽ� �湮���θ� 0���� �ʱ�ȭ�Ѵ�.
		}
		
	}

}
