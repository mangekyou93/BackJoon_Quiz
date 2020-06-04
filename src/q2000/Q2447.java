package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2447 {

	//백준 문제 2447 : 별 찍기 - 10
	//이것도 역시 분할정복 : 앞에서 피보나치도 작은단위로 쪼개면서 결국 마지막에 피보나치수열이 완성됨.
	//가장 작을 단위까지 재귀를 호출하면서 가장 작을 단위가 될 때, 하나씩 배열을 채워감.
	
	//N=3
	//***
	//* *
	//***
	
	//N=9=3^2
	//*********
	//* ** ** *
	//*********
	//***   ***
	//* *   * *
	//***   ***
	//*********
	//* ** ** *
	//*********
	
	//2차원 배열, N=3이면 star[1][1]이 공백
	//즉, [0][0] -> [0][1] -> [0][2] -> [1][0] : 별을 채우고 [1][1]은 공백으로
	//N=9이면 N=3인 것을 똑같이 채우고 5번째일 떄 공백
	
	static char[][] star;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		star = new char[n][n];
		
		printStar(n, 0, 0, false);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(star[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}
	
	
	public static void printStar(int n, int x, int y, boolean blank) {
		
		//공백 칸일 경우
		if(blank) {
			for(int i=x ; i<x+n ; i++) {
				for(int j=y ; j<y+n ; j++) {
					star[i][j] = ' ';
				}
			}
			return ;
		}
		
		if(n == 1) {
			star[x][y] = '*';
			return ;
		}
		
		/*
		N=27 일 경우 한 블록의 사이즈는 9이고, 
		N=9 일 경우 한 블록의 사이즈는 3이듯
		해당 블록의 한 칸을 담을 변수를 의미 size
        
		count는 별 출력 누적을 의미
		*/

		int size = n / 3;
		int count = 0;
		for (int i = x; i < x + n; i += size) {
			for (int j = y; j < y + n; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					printStar(size, i, j, true);
				} else {
					printStar(size, i, j, false);
				}
			}
		}
	}
}
