package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q5567 {

	//백준 문제 5567 : 결혼식
	//분류 : 구현
	
	//bfs임..
	//상근이와 친구들의 관계를 양방향 그래프로 설계
	//상근이와 친구들의 관계를 그래프로 나타내었을 때, 시작점(상근이)으로부터 최단거리가 2이하인 정점의 개수를 구하시오.
	static int[][] friends;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashSet<Integer> hs = new HashSet<Integer>();
		int N = Integer.parseInt(br.readLine());			// N : 동기의 수	(2 <= n <= 500)
		int M = Integer.parseInt(br.readLine());			// M : 리스트의 길이	(1 <= M <= 10000)
		
		friends = new int[M][2];
				
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			friends[i][0] = a;
			friends[i][1] = b;
			
			if(a == 1) {
				hs.add(b);
			}
		}
		
		Arrays.sort(friends, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		int count = hs.size();
		
		for(int i=0 ; i<M ; i++) {
			if(hs.contains(friends[i][0]) && !hs.contains(friends[i][1])) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
