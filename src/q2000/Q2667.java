package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Q2667 {

	//백준 문제 2667 : 단지번호붙이기
	//메모리 : 14MB / 시간 : 0.096 s
	
	//static boolean[][] visited = new boolean[N][N]	<< 이거를 해주면 시간이 좀 더 단축될 것으로 예상
	//													   dfs함수에서 visited[nx][ny] == true이면 for문을 돌기도 전에 나온다.
	//													      물론 for문이 하나여서 시간은 그리 오래걸리진 않지만 N이 엄청나게 크다면 그래도 꽤 잡아먹을 것임.
	static int N;
	static int[][] arr;
	static int[] dx = {1, -1, 0, 0};	//하, 상, 우, 좌	(1, 0) , (-1, 0) , (0, 1) , (0, -1)
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
		
		//우선순위 큐를 사용한 이유 : 오름차순때문에
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
