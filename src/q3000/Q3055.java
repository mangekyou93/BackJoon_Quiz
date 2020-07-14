package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q3055 {

	//백준 문제 3055 : 탈출
	//메모리 : 14MB / 시간 : 0.080 s
	static char[][] forest;
	static int[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static Queue<int[]> hedgehog = new LinkedList<int[]>();
	static Queue<int[]> water = new LinkedList<int[]>();
	static int R,C;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		int[] end = new int[2];
		
		forest = new char[R][C];
		visited = new int[R][C];
		for(int i=0 ; i<R ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<s.length() ; j++) {
				char ch = s.charAt(j);
				forest[i][j] = ch;
				
				if(ch == 'S') {
					hedgehog.offer(new int[] {i, j});
					visited[i][j] = 1;
				}
				if(ch == '*') {
					water.offer(new int[] {i, j});
					visited[i][j] = -1;
				}
				if(ch == 'D') {
					end[0] = i;
					end[1] = j;
				}
			}
		}
		
		bfs();
		
		System.out.println(visited[end[0]][end[1]] == 0 ? "KAKTUS" : visited[end[0]][end[1]]-1);
	}
	
	public static void bfs() {
		
		while(!hedgehog.isEmpty() || !water.isEmpty()) {
			int hSize = hedgehog.size();
			int wSize = water.size();
			
			for(int i=0 ; i<wSize ; i++) {
				int[] w = water.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = w[0] + dx[j];
					int ny = w[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < R && ny < C) {
						if(visited[nx][ny] == 0 && forest[nx][ny] == '.') {
							visited[nx][ny] = -1;
							forest[nx][ny] = '*';
							water.offer(new int[] {nx, ny});
						}
					}
				}
			}
			
			for(int i=0 ; i<hSize ; i++) {
				int[] h = hedgehog.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = h[0] + dx[j];
					int ny = h[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < R && ny < C) {
						if(visited[nx][ny] == 0 && (forest[nx][ny] == '.' || forest[nx][ny] == 'D')) {
							visited[nx][ny] = visited[h[0]][h[1]] + 1;
							hedgehog.offer(new int[] {nx, ny});
						}
					}
				}
			}
		}
	}
}
