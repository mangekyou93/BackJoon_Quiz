package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10026 {

	//���� ���� 10026 : ���ϻ���
	//�޸� : 14MB / �ð� : 0.092 s
	
	//���� for���� 2�� ����ϱ� ������, �ð��� ���� �Ⱦ�
	static char[][] area;
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int N;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		area = new char[N][N];
		visited = new boolean[N][N];
		
		for(int i=0 ; i<N ; i++) {
			area[i] = br.readLine().toCharArray();
		}
		
		int count = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		
		visited = new boolean[N][N];
		int count2 = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					count2++;
				}
			}
		}
		
		System.out.println(count+" "+count2);
	}
	
	public static void dfs(int a, int b) {
		visited[a][b] = true;
		char ch = area[a][b];
		if(ch == 'G') area[a][b] = 'R';
		
		for(int i=0 ; i<4 ; i++) {
			int nx = a + dx[i];
			int ny = b + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(ch == area[nx][ny] && !visited[nx][ny]) dfs(nx, ny);
			}
		}
	}
}
