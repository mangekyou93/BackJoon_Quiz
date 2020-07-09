package q14000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14502 {

	//백준 문제 14502 : 연구소
	//분류 : 브루트 포스
	static int[][] lab;
	static int max,N,M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		lab = new int[N][M];
		for(int i=0; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<M ; j++) {
				lab[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		safezone();
		
	}
	
	public static void safezone() {
		int cnt = 3;
		int[][] arr = lab;
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				if(arr[i][j] != 0 || arr[i][j+1] != 0) continue;
				
				for(int k=0 ; k<M ; k++) {
					
				}
			}
		}
	}
	
	public static void check() {
		int count = 0;
	}
}
