package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2573 {

	//백준 문제 2573 : 빙산
	//메모리 : 47MB / 시간 : 0.408 s
	
	//처음 짤때는 component가 0이면 그만 돌려야 하는 break가 없어서 시간 초과가 나왔음 
	//빙산이 전부 녹아 component가 0이면 그만 돌고 break를 걸어 count = 0을 출력하면 되는데 이중 for문을 계속 돔
	
	//지금은 count라는 함수를 만들어서 component가 0이면 (빙산이 1개로 다 녹아 없어지면) count = 0주고 break를 검
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
