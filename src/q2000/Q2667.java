package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q2667 {

	//���� ���� 2667 : ������ȣ���̱�
	//�޸� : 14MB / �ð� : 0.096 s
	
	//static boolean[][] visited = new boolean[N][N]	<< �̰Ÿ� ���ָ� �ð��� �� �� ����� ������ ����
	//													   dfs�Լ����� visited[nx][ny] == true�̸� for���� ���⵵ ���� ���´�.
	//													      ���� for���� �ϳ����� �ð��� �׸� �����ɸ��� ������ N�� ��û���� ũ�ٸ� �׷��� �� ��Ƹ��� ����.
	static int N;
	static int[][] arr;
	static int[] dx = {1, -1, 0, 0};	//��, ��, ��, ��	(1, 0) , (-1, 0) , (0, 1) , (0, -1)
	static int[] dy = {0, 0, 1, -1};
	static int count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		//�켱���� ť�� ����� ���� : ��������������
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int total = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(arr[i][j] == 1) {
					count = 0;
					total++;
					
					dfs(i, j);
					
					pq.add(count);
				}
			}
		}
		System.out.println(total);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
	public static void dfs(int x, int y) {
		arr[x][y] = 0;
		count++;
		
		for(int i=0 ; i<4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(arr[nx][ny] == 1) {
					dfs(nx, ny);
				}
			}
		}
	}
	
}
