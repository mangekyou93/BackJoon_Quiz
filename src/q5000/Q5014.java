package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5014 {

	//백준 문제 5014 : 스타트링크
	//메모리 : 57MB / 시간 : 0.196 s
	
	//문제 똑바로 안읽음..
	//범위 설정도 잘못했음...
	static int[] floor;
	static int F,U,D;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		F = Integer.parseInt(st.nextToken());			// 꼭대기 층 수
		floor = new int[F+1];
		int S = Integer.parseInt(st.nextToken());		// 강호가 있는 층 수
		int G = Integer.parseInt(st.nextToken());		// 스타트링크 층 수
		U = Integer.parseInt(st.nextToken());			// 위로 이동
		D = Integer.parseInt(st.nextToken());			// 아래로 이동
		
		bfs(S);
		
		if(floor[G] == 0) System.out.println("use the stairs");
		else if(floor[G] == -1) System.out.println(0);
		else System.out.println(floor[G]);
	}
	
	public static void bfs(int s) {
		floor[s] = -1;
		int count = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s);
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			count++;
			
			for(int i=0 ; i<qSize ; i++) {
				int x = q.poll();
				
				for(int j=0 ; j<2 ; j++) {
					int nx = 0;
					if(j == 0) nx = x + U;
					else nx = x - D;
					
					if(nx > 0 && nx <= F) {
						if(floor[nx] == 0) {
							floor[nx] = count;
							q.offer(nx);
						}					
					}
				}
			}
		}
	}
}
