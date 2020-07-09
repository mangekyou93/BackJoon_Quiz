package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1937 {

	//백준 문제 1937 : 욕심쟁이 판다
	//분류 : 정렬
	
	//시간초과 실패(1000001번 + 재귀함수로 인해, 2020-06-17)
	static int N;
	static int[][] bamboo;
	static String[] position;
	static int max = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		bamboo = new int[N][N];
		position = new String[1000001];
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				int a = Integer.parseInt(st.nextToken());
				bamboo[i][j] = a;
				position[a] = i+" "+j;
			}
		}
		
		for(int i=1 ; i<position.length ; i++) {
			if(position[i] == null) continue;
			st = new StringTokenizer(position[i], " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			findBamboo(x, y, 1);
		}
		
		System.out.println(max);
	}
	
	public static void findBamboo(int x, int y, int count) {
		if(max < count) max = count;
		
		if(x - 1 >= 0) {
			if(bamboo[x][y] < bamboo[x-1][y]) findBamboo(x-1, y, count+1);		// 상
		}
		
		if(x + 1 < N) {
			if(bamboo[x][y] < bamboo[x+1][y]) findBamboo(x+1, y, count+1);		// 하
		}
		
		if(y - 1 >= 0) {
			if(bamboo[x][y] < bamboo[x][y-1]) findBamboo(x, y-1, count+1);		// 좌
		}
		
		if(y + 1 < N) {
			if(bamboo[x][y] < bamboo[x][y+1]) findBamboo(x, y+1, count+1);		// 우
		}
	}
	
}
