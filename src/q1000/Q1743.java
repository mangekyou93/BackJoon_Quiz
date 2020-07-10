package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1743 {
	
	//���� ���� 1743 : ���Ĺ� ���ϱ�
	//�޸� : 15MB / �ð� : 0.112 s
	static int[][] path;
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int N,M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		path = new int[N][M];
		visited = new boolean[N][M];
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<K ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			path[x-1][y-1] = 1;
		}
		
		int count = 0;
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(!visited[i][j] && path[i][j] == 1) {
					count = Math.max(count, dfs(i,j));
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static int dfs(int x, int y) {
		int count = 1;
		visited[x][y] = true;
		
		for(int i=0 ; i<4 ; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if(!visited[nx][ny] && path[nx][ny] == 1) {
					count += dfs(nx, ny);
				}
			}
		}
		return count;
	}
}
