package q12000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12100 {

	//백준 문제 12100 : 2048 (Easy)
	static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}
	
	public static void bfs() {
		
	}
}
