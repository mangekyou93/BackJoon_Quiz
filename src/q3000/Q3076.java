package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3076 {
	
	//백준 문제  3076 : 상근이의 체스판
	//분류 : 반복문
	//백준 문제 1018(체스판 다시 칠하기, 브루트 포스)을 풀어보기 전에 이걸 먼저 풀어봤어야 했나
	
	//별찍기랑 비슷한 문제
	//메모리 아낄려고 2차원 배열 안만들고, 문자열로 만듬
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<R*A ; i++) {
			if((i / A) % 2 == 0) {
				for(int j=0 ; j<C*B ; j++) {
					if((j / B) % 2 == 0) {
						sb.append("X");
					} else {
						sb.append(".");
					}
				}
			} else {
				for(int j=0 ; j<C*B ; j++) {
					if((j / B) % 2 == 0) {
						sb.append(".");
					} else {
						sb.append("X");
					}
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

}
