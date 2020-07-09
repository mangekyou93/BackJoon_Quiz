package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1100 {

	//백준 문제 1100 : 하얀 칸
	//분류 : 문자열 처리
	static boolean[][] chess = new boolean[8][8];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<8 ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<8 ; j++) {
				if(s.charAt(j) == 'F') {
					chess[i][j] = true;
				}
			}
		}
		
		
		int count = 0;
		for(int i=0 ; i<8 ; i++) {
			if(i%2 == 0) {
				for(int j=0 ; j<8 ; j+=2) {
					if(chess[i][j]) count++;
				}
			} else {
				for(int j=1 ; j<8 ; j+=2) {
					if(chess[i][j]) count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
}
