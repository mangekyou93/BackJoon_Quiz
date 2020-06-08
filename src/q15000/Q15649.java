package q15000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {

	//백준 문제 15649 : N과 M (1)
	//메모리 : 55MB / 시간 : 0.216 s
	//백트래킹 입문
	//백트래킹이란, '가능한 모든 방법을 탐색한다.' 대표적인 완전 탐색 방법으로는 DFS(Depth First Search, 깊이 우선 탐색)이 있다.
	//DFS는 현재 지점에서 방문할 곳이 있으면 재귀 호출을 이옹해서 계속 이동한다.
	//DFS 의 장점은 무한히 깊은 곳을 찾아야할때 효과적이다.
	//하지만 DFS 는 모든곳을 방문하기 때문에 굳이 목표지점이 있지 않는 경로로 빠져서 비효율적인 결과를 초래할수도 있다.
	//완전 탐색과는 다른 점 : 어떠한 조건에 걸리지 못하면, 다 배제하는 탐색이라서
	
	//너무 어려운 것이다...
	//for문 안에 재귀라니
	//재귀를 사용하면 반드시 끝나는 지점이 있어야된다는 건 알지만, 구현을 아에 못하겠음..
	static StringBuilder sb = new StringBuilder();
	static int[] check, list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		check = new int[9];
		list = new int[9];

		sequence(n, m, 0);
		
		System.out.println(sb);
	}
	
	public static void sequence(int n, int m, int cnt) {
		
		if(cnt == m) {	// 0부터 M번까지 반복했으면 하나의 처리가 완성
			
						// 개인적인 생각으로는 이부분이 백트래킹에 해당한다고 생각한다.
            // M보다 큰 횟수는 고려하지 않고 배제한다.
			for(int i=0;i<m;i++) { // 현재 결과배열을 출력
				sb.append(list[i]+" ");
			}
			sb.append("\n");
			return; // DFS 종료 
		}
		
		
		for(int i=1 ; i<=n ; i++) {
			
			if(check[i] == 1) continue;
			check[i] = 1;
			list[cnt] = i;					// 현재 반복횟수에 해당하는 배열에 i값을 넣는다.
			sequence(n, m, cnt+1);			// 반복횟수를 증가시킨다.
			check[i] = 0;					// dfs가 종료 후에는 다시 방문여부를 0으로 초기화한다.
		}
		
	}

}
