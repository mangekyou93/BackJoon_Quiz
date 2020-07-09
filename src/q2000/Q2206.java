package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2206 {

	//백준 문제 2206 : 벽 부수고 이동하기
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
	
	
	/*
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
