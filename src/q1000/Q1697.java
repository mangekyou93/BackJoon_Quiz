package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {

	//백준 문제 1697 : 숨바꼭질
	//메모리 : 19MB / 시간 : 0.128 s
	//너무 아깝다 문제가...
	//좀만 더 BFS로 했으면 풀 수 있었을텐데
	//토마토문제에서 z축까지 생긴 것으로 볼 때
	//인접한 기준이 꼭 +1, -1이 아니라 *2가 될 수도 있다.
	//따라서 인접한 양이 꼭 같지만은 않다는 것도 알아두어야 한다.
	static int N, K;
	static int[] position;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		position = new int[100001];
		
		Arrays.fill(position, -1);
		
		bfs();
		
		System.out.println(position[K]);
	}
	
	public static void bfs() {
		int next = N;
		int[] status = new int[3];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(N);
		position[N] = 0;
		
		while(!q.isEmpty()) {
			if(next == K) break;
			
			next = q.poll();
			status[0] = next - 1;		// 뒤로 한 칸
			status[1] = next + 1;		// 앞으로 한 칸
			status[2] = next * 2;		// 순간이동
			
			for(int i=0 ; i<3 ; i++) {
				
				if(status[i] >= 0 && status[i] <= 100000) {
					
					//방문하지 않았다면
					if(position[status[i]] == -1) {
						position[status[i]] = position[next] + 1;
						q.offer(status[i]);
					}
				}
			}
			
		}
	}
}
