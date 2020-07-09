package q7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7569 {

	//백준 문제 7569 : 토마토
	//7576번의 3차원 z축만 추가된 것
	//메모리 : 145MB / 시간 : 0.648 s
	static int[][][] tomato;
	static int[][] dxyz = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
	static int N, M, H, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Queue<Integer> q = new LinkedList<Integer>();
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		tomato = new int[N][M][H];
		
		for(int i=0 ; i<H ; i++) {
			for(int j=0 ; j<N ; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k=0 ; k<M ; k++) {
					int a = Integer.parseInt(st.nextToken());
					tomato[j][k][i] = a;
					if(a == 1) {
						q.offer(j);
						q.offer(k);
						q.offer(i);
					}
				}
			}
		}
		
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			count++;
			for(int i=0 ; i<qSize/3 ; i++) {
				int x = q.poll();
				int y = q.poll();
				int z = q.poll();
				
				for(int j=0 ; j<6 ; j++) {
					int nx = x + dxyz[j][0];
					int ny = y + dxyz[j][1];
					int nz = z + dxyz[j][2];
					
					if(nx >= 0 && ny >= 0 && nz >= 0 && nx < N && ny < M && nz < H) {
						if(tomato[nx][ny][nz] == 0) {
							tomato[nx][ny][nz] = 1;
							q.offer(nx);
							q.offer(ny);
							q.offer(nz);
						}
					}
				}
			}
		}
		
		if(check()) System.out.println(count - 1);
		else System.out.println(-1);
	}
	
	public static boolean check() {
		
		for(int i=0 ; i<H ; i++) {
			for(int j=0 ; j<N ; j++) {
				for(int k=0 ; k<M ; k++) {
					if(tomato[j][k][i] == 0) return false;
				}
			}
		}
		
		return true;
	}
	
	
	/*
	static int[][] tomato;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int N, M, H, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		tomato = new int[N*H][M];
		for(int i=0 ; i<N*H ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<M ; j++) {
				tomato[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs();
		if(!check()) {
			System.out.println(-1);
		} else {
			System.out.println(count-1);
		}
	}
	
	public static boolean check() {
		
		for(int i=0 ; i<N*H ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(tomato[i][j] == 0) return false;
			}
		}
		
		return true;
	}
	
	public static void bfs(){
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0 ; i<N*H ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(tomato[i][j] == 1) {
					q.offer(i);
					q.offer(j);
				}
			}
		}
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			count++;
			
			for(int i=0 ; i<qSize/2 ; i++) {
				int x = q.poll();
				int y = q.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < N*H && ny < M) {
						if(tomato[nx][ny] == 0) {
							tomato[nx][ny] = 1;
							q.offer(nx);
							q.offer(ny);
						}
					}
				}
				
				for(int k=0 ; k<H ; k++) {
					int zx = x + N;
					int xz = x - N;
					
					if(zx >= 0 && zx < N*H) {
						if(tomato[zx][y] == 0) {
							tomato[zx][y] = 1;
							q.offer(zx);
							q.offer(y);
						}
					}
					if(xz >= 0 && xz < N*H) {
						if(tomato[xz][y] == 0) {
							tomato[xz][y] = 1;
							q.offer(xz);
							q.offer(y);
						}
					}
				}
			}
		}
	}
	*/
}
