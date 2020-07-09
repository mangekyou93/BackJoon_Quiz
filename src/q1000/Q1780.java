package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1780 {

	//백준 문제 1780 : 종이의 개수
	//분류 : 분할 정복
	static int[][] paper;
	static int[] arr = new int[3];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dq(N, 0, 0);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public static void dq(int n, int x, int y) {
		if(check(n, x, y)) {
			arr[paper[x][y]+1]++;
		} else {
			int size = n / 3;
			
			for(int i=x ; i<x+n ; i+=size) {
				for(int j=y ; j<y+n ; j+=size) {
					dq(size, i, j);
				}
			}
		}
		
	}
	
	public static boolean check(int n, int x, int y) {
		int std = paper[x][y];
		
		for(int i=x ; i<x+n ; i++) {
			for(int j=y ; j<y+n ; j++) {
				if(std != paper[i][j]) return false;
			}
		}
		
		return true;
	}
}
