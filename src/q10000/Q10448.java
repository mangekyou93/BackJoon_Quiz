package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10448 {

	//백준 문제 10448 : 유레카 이론
	//분류 : 브루트 포스
	
	//메모리 : 14MB / 시간 : 0.208 s
	static int[] sam = new int[1000];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i=1 ; i<sam.length ; i++) {
			sam[i] = sam[i-1]+i;
		}
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int K = Integer.parseInt(br.readLine());
			
			sb.append(check(K)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int check(int n) {
		
		for(int i=1 ; i<n ; i++) {
			for(int j=1 ; j<n ; j++) {
				for(int k=1 ; k<n ; k++) {
					if(sam[i] + sam[j] + sam[k] == n) return 1;
				}
			}
		}
		
		return 0;
	}
}
