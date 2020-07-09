package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3085 {

	//백준 문제 3085 : 사탕 게임
	//분류 : 브루트 포스
	
	//꼼꼼히 코딩 해야된다.
	//브루트 포스 즉, 완전 탐색은 그냥 노가다로 하라고 만든거니까
	//오히려 정교하게 코딩했나를 볼 듯 하다.
	static char[][] candy;
	static int N,row = 0, col = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		candy = new char[N][N];
		
		for(int i=0 ; i<N ; i++) {
			candy[i] = br.readLine().toCharArray();
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(j+1 < N) {
					char t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j+1] = t;
					
					findCandy();
					
					t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j+1] = t;
				}
				
				if(i+1 < N) {
					char t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
					
					findCandy();
					
					t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
				}
			}
		}
		System.out.println(row >= col ? row : col);
		
		
		/*
		//내 소스
		for(int i=0 ; i<N ; i++) {
			int a = 0;
			for(int j=0 ; j<N ; j++) {
				if(a == j) continue;
				char temp = candy[i][j];
				candy[i][j] = candy[i][a];
				candy[i][a] = temp;
				
				findCandy();
				
				temp = candy[i][j];
				candy[i][j] = candy[i][a];
				candy[i][a] = temp;
				
				a++;
			}
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			int a = i+1;
			for(int j=0 ; j<N ; j++) {
				char temp = candy[i][j];
				candy[i][j] = candy[a][j];
				candy[a][j] = temp;
				
				findCandy();
				
				temp = candy[i][j];
				candy[i][j] = candy[a][j];
				candy[a][j] = temp;
			}
		}
		
		System.out.println(row > col ? row : col);
		*/
	}
	
	public static void findCandy() {
		
		for(int i=0 ; i<N ; i++) {
			int cnt = 1;
			for(int j=1 ; j<N ; j++) {
				if(candy[i][j] == candy[i][j-1]) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if(row < cnt) row = cnt;
			}
			
			cnt = 1;
			for(int j=1 ; j<N ; j++) {
				if(candy[j][i] == candy[j-1][i]) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if(col < cnt) col = cnt;
			}
		}
		
		
		
		/*
		//내 소스
		int rowCount = 0;
		int colCount = 0;
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				rowCount = 0;
				colCount = 0;
				char c = candy[i][j];
				
				//가로
				for(int k=0 ; k<N ; k++) {
					if(c == candy[i][k]) {
						rowCount++;
					} else {
						break;
					}
				}
				
				//세로
				for(int k=0 ; k<N ; k++) {
					if(c == candy[k][i]) {
						colCount++;
					} else {
						break;
					}
				}
				
				if(row < rowCount) {
					row = rowCount;
				}
				if(col < colCount) {
					col = colCount;
				}
			}
		}
		*/
	}
}
