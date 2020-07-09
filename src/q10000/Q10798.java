package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10798 {

	//백준 문제 10798 : 세로읽기
	//분류 : 구현
	//공백을 몰라서 *을 넣어줌
	//문자 공백은 '\0'이다.
	//진짜 쉬운 문제인데 String으로 만들려고 하다보니까 어려움
	//2차원 배열로 했으면 금방 풀었을듯
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] board = new char[5][15];
		
		for(int i=0 ; i<5 ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<15 ; j++) {
				if(j < s.length()) {
					board[i][j] = s.charAt(j);
				} else {
					board[i][j] = '*';
				}
			}
		}
		
		
		for(int i=0 ; i<15 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(board[j][i] == '*') continue;
				sb.append(board[j][i]);
			}
		}
		
		
		System.out.println(sb);
	}
	
}
