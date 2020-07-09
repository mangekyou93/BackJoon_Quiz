package q7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7576 {

	//백준 문제 7576 : 토마토
	//메모리 : 150MB / 시간 : 0.608 s
	
	//시간과 메모리를 꽤 많이씀
	//다른 코드들도 참고해보자
	static int[][] tomato;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static int N, M, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		tomato = new int[N][M];
		for(int i=0 ; i<N ; i++) {
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
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(tomato[i][j] == 0) return false;
			}
		}
		
		return true;
	}
	
	public static void bfs(){
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0 ; i<N ; i++) {
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
					
					if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
						if(tomato[nx][ny] == 0) {
							tomato[nx][ny] = 1;
							q.offer(nx);
							q.offer(ny);
						}
					}
				}
			}
		}
	}
}
