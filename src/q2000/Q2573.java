package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2573 {

	//���� ���� 2573 : ����
	//�޸� : 47MB / �ð� : 0.408 s
	
	//ó�� ©���� component�� 0�̸� �׸� ������ �ϴ� break�� ��� �ð� �ʰ��� ������ 
	//������ ���� ��� component�� 0�̸� �׸� ���� break�� �ɾ� count = 0�� ����ϸ� �Ǵµ� ���� for���� ��� ��
	
	//������ count��� �Լ��� ���� component�� 0�̸� (������ 1���� �� ��� ��������) count = 0�ְ� break�� ��
	static int[][] ice;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		ice = new int[N][M];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<M ; j++) {
				ice[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int count = 0;
		int component = 0;
		while((component = count()) <= 1) {
			if(component == 0) {
				count = 0;
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}
	
	public static int count() {
		int cnt = 0;
		visited = new boolean[N][M];
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(ice[i][j] != 0 && !visited[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		int minus = 0;
		
		for(int i=0 ; i<4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
				if(ice[nx][ny] == 0 && !visited[nx][ny]) minus++;
				else if(ice[nx][ny] > 0 && !visited[nx][ny]) dfs(nx, ny);
			}
		}
		ice[x][y] = ice[x][y] - minus < 0 ? 0 : ice[x][y] - minus;
	}
}
