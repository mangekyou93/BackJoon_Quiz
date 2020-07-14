package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1525 {

	//���� ���� 1525 : ����
	//�޸� : 135MB / �ð� : 0.724 s
	
	//���� ���� ����...
	//2���� �迭�� 1���� �迭�� �ٲܶ� int�θ� �ٲ� �� �ִٴ°� �ʹ� �ű���.
	//10^9 ���� 2^30�� ����ϴϱ�
	//9�ڸ� ���ڰ� ������ int�� ����ص� ������.
	//���� �̿��ؼ� visited�� ���� �͵� ��¥ ����ϴ�..
	static int[] puzzle = new int[9];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int count = 0;
	static Queue<Integer> q = new LinkedList<Integer>();
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//2���� ������ 1�������� �ٲ��ش�?
		int start = 0;
		for(int i=0 ; i<3 ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<3 ; j++) {
				int temp = Integer.parseInt(st.nextToken());
				// 0�� �� 9�� ��ȯ
				// 0�� 9�� ���Ѵٴ� �͸� ����, �迭ó�� 1934.... �̷��� ��ȯ ��
				if(temp == 0) temp = 9;
				start = (start * 10) + temp;
			}
		}
		
		q.offer(start);
		map.put(start, 0);
		
		System.out.println(bfs());
	}
	
	public static int bfs() {
		
		while(!q.isEmpty()) {
			
			int curr = q.poll();
			String curr_str = String.valueOf(curr);
			
			if(curr_str.equals("123456789")) {
				return map.get(curr);
			}
			
			int nine = curr_str.indexOf('9');
			// ���� 9(== 0)�� ��ǥ�� �˾Ƴ���.
			// �� ������ ��, ������ ������ ���� ��Ÿ����.
			int r = nine / 3;	//��
			int c = nine % 3;	//��
			
			for(int i=0 ; i<4 ; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
				
				if(nr >= 0 && nc >= 0 && nr < 3 && nc < 3) {
					StringBuilder next_str = new StringBuilder(curr_str);
					// r * 3 + c�� ��ǥ�Ǥ� 1���� �迭������ ��ġ�̴�.
					// ���� 9�� ��ġ�� ���� ��ġ�� ���ڸ� �ٲ۴�.
					char temp = next_str.charAt(nr * 3 + nc);
					next_str.setCharAt(nr * 3 + nc, '9');
					next_str.setCharAt(nine, temp);
					
					int next = Integer.parseInt(next_str.toString());
					
					//�ʿ� ����(������ ���� ������ ����) ��쿡�� �ʿ� �߰��Ѵ�. :: visited�� ����� ��Ȱ
					if(!map.containsKey(next)) {
						map.put(next, map.get(curr) + 1);
						q.offer(next);
					}
				}
			}
		}
		
		//�ȳ����� ���
		return -1;
	}
}
