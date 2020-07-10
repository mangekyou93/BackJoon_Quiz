package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {

	//백준 문제 2206 : 벽 부수고 이동하기
	//메모리 : 137MB / 시간 : 0.496 s
	
	//3차원으로 벽을 부수고 이동하는 면과 벽 없이 진행하는 면
	//2가지 면을 나누어서 진행하는 것으로 많이들 풀었음...
	//이런건 유형을 외워야 하는건가..
	static int N, M, count = -1;
	static int[][] arr;
	static int[] dy = {0, 0, 1, -1};
	static int[] dx = {1, -1, 0, 0};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				int a = s.charAt(j) - '0';
				arr[i][j] = a;
			}
		}
		
		bfs();
		System.out.println(count);
	}
	
	public static void bfs() {
		boolean visited[][][] = new boolean[2][N][M];
		Queue<int[]> q = new LinkedList<int[]>();			//배열도 넣을 수 있구나...
		q.offer(new int[] {0, 0, 0, 1});
		visited[0][0][0] = true;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			
			if(curr[0] == N - 1 && curr[1] == M - 1) {		//visited[1][][] , visited[0] 이든
				count = curr[3];							//이건 도착지점이면 그냥 break; 주는 건가봄 제일 먼저 도착했으니
				break;
			}
			
			for(int i=0 ; i<4 ; i++) {
				int nx = curr[0] + dx[i];
				int ny = curr[1] + dy[i];
				
				if((nx >= 0 && ny >= 0 && nx < N && ny < M) && !visited[curr[2]][nx][ny]) {
					if(arr[nx][ny] == 0) {
						visited[curr[2]][nx][ny] = true;
						q.offer(new int[] {nx, ny, curr[2], curr[3]+1});
					} else if(curr[2] == 0) {
						visited[1][nx][ny] = true;
						q.offer(new int[] {nx, ny, 1, curr[3]+1});
					}
				}
			}
		}
	}
	
	
	/*
	//내가 푼 것
	//실제로 되진 않음
	static int N, M;
	static int[][] arr;
	static int[][] score;
	static int[] dy = {0, 0, 1, -1};
	static int[] dx = {1, -1, 0, 0};
	static int min = 1000001;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		score = new int[N][M];
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				int a = s.charAt(j) - '0';
				arr[i][j] = a;
			}
		}
		
		bfs();
		System.out.println(score[N-1][M-1] == 0 ? -1 : score[N-1][M-1]);
	}
	
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		arr[0][0] = -1;
		score[0][0] = 1;
		q.offer(0);
		q.offer(0);
		q.offer(1);
		q.offer(1);
		
		while(!q.isEmpty()) {
			int qSize = q.size()/4;
			
			for(int i=0 ; i<qSize ; i++) {
				int x = q.poll();
				int y = q.poll();
				int status = q.poll();
				int count = q.poll()+1;
				
				for(int j=0 ; j<4 ; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
						if(arr[nx][ny] == 0) {					// 그냥 길
							arr[nx][ny] = -1;
							q.offer(nx);
							q.offer(ny);
							q.offer(status);
							q.offer(count);
							score[nx][ny] = count;
							
						} else if(arr[nx][ny] == -1) {			// 왔던 길
							if(count <= score[nx][ny]) {
								q.offer(nx);
								q.offer(ny);
								q.offer(status);
								q.offer(count);
								score[nx][ny] = count;
							} 
						} else {								// 벽
							if(status == 1) {
								q.offer(nx);
								q.offer(ny);
								q.offer(0);
								q.offer(count);
								score[nx][ny] = Math.min(count, score[nx][ny]);
							}
						}
					}
				}
			}
		}
	}
	*/
}
