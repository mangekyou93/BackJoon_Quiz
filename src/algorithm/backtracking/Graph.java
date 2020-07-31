package algorithm.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph {

	//백트래킹 : 완전 탐색의 한 종류, 가능한 모든 조합을 다 시도하는 것
	//백준 문제 15649 : N과 M (1)로 기본 개념과 백트래킹의 전형적인 구조를 알려줌
	//사실 N과 M 문제는 C++이라면 STL에 next_permutation이라고 함수가 존재하여, next_permutation으로도 구현이 가능하다고 한다.
	//JAVA에는 next_permutation같은 함수가 없기 때문에 함수도 구현해보는 것도 좋을 것 같다.
	
	//2020-07-30에 풀었던 알파벳(DFS 사용)문제도 true로 재귀를 돌면서 재귀가 끝날 때 false로 변경해주면서 다음 방향을 진행했었는데,
	//재귀 호출의 아름다움이 느껴진다.
	static int N, M;
	static int[] arr = new int[10];
	static boolean[] used = new boolean[10];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		startBacktracking(0);
		
	}
	
	public static void startBacktracking(int k) {
		if(k == M) {
			for(int i=0 ; i<M ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return ;
		}
		
		for(int i=1 ; i<=N ; i++) {
			if(!used[i]) {
				arr[k] = i;
				used[i] = true;
				startBacktracking(k+1);				//재귀를 통해서 
				used[i] = false;
			}
		}
	}
}
