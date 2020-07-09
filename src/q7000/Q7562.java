package q7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562 {

	//백준 문제 7562 : 나이트의 이동
	//메모리 : 140MB / 시간 : 0.4 s
	static int I;
	static int[][] chess;
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			I = Integer.parseInt(br.readLine());
			chess = new int[I][I];
			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			
			bfs(startX, startY);

			st = new StringTokenizer(br.readLine());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			
			sb.append(chess[endX][endY]-1).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void bfs(int startX, int startY) {
		chess[startX][startY] = 1;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(startX);
		q.offer(startY);
		
		int count = 1;
		while(!q.isEmpty()) {
			int qSize = q.size()/2;
			count++;
			for(int i=0 ; i<qSize ; i++) {
				int x = q.poll();
				int y = q.poll();
				
				for(int j=0 ; j<8 ; j++) {
					int nx = x + dx[j];
					int ny = y + dy[j];
					
					
					if(nx >= 0 && ny >= 0 && nx < I && ny < I) {
						if(chess[nx][ny] == 0) {
							chess[nx][ny] = count;
							q.offer(nx);
							q.offer(ny);
						}
					}
				}
			}
		}
	}
}
