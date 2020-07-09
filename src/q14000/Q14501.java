package q14000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14501 {

	//백준 문제 14501 : 퇴사
	//분류 : 브루트 포스 
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[N][0] = Integer.parseInt(st.nextToken());
			arr[N][1] = Integer.parseInt(st.nextToken());
		}
		
		
		//N을 절대로 넘으면 안돼.
		//일을 최대한 많이 하는 것보다, 돈을 많이 주는 것이 더 나을 때가 있음.
		int a = N;
		int count = 0;
		while(N >= 0) {
			for(int i=0 ; i<a ; i++) {
				
				N -= arr[i][0];
			}
		}
	}
}
