package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2468 {

	//백준 문제 2468 : 안전 영역
	//메모리 : 18MB / 시간 : 0.192 s
	//DFS 문제
	//침수 된 지역을 제외한 안전 영역을 구하는 것인데
	//0~max까지 비가 온 지역을 전부 for문을 돌면서
	//컴포넌트의 숫자가 가장 큰 것을 고르면 됨
	static int[][] area;
	static boolean[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		area = new int[N][N];
		int max = 0;
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, area[i][j]);
			}
		}
		
		int answer = 0;
		for(int i=0 ; i<=max ; i++) {
			int component = 0;
			visited = new boolean[N][N];
			
			for(int j=0 ; j<N ; j++) {
				for(int k=0 ; k<N ; k++) {
					if(area[j][k] > i && !visited[j][k]) {
						dfs(j, k, i);
						component++;
					}
				}
			}
			
			answer = Math.max(component, answer);
		}
		
		System.out.println(answer);
	}
	
	public static void dfs(int startX, int startY, int rain) {
		visited[startX][startY] = true;
		
		for(int i=0 ; i<4 ; i++) {
			int nx = startX + dx[i];
			int ny = startY + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(area[nx][ny] > rain && !visited[nx][ny]) {
					dfs(nx, ny, rain);
				}
			}
		}
	}
}
