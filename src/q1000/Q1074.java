package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1074 {

	//백준 문제 1074 : Z
	//분류 : 재귀 호출
	
	//Z탐색 알고리즘 굳굳
	//그래도 성과가 있음
	
	//일단 2차원 배열로 구현은 성공했는데, 메모리 초과 나옴
	//2차원 배열을 1차원 배열로 줄이기만 하면 됨
	//배열 사용 불가능...
	//1차원 배열도 2^15 * 2^15 = 1,073,741,824 개임
	//메모리 : 14MB / 시간 3.520 s (시간 실패)
	//flag준 것
	//메모리 : 14MB / 시간 3.020 s (시간 실패)
	//아마도 재귀라서 추가시간 준듯
	//그래도 플래그 있나 없나의 차이가 엄청 크다
	static int r,c, count = 0;
	static boolean flag = false;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = (int)Math.pow(2, Integer.parseInt(st.nextToken()));
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		
		z(N, 0, 0);
		
	}
	
	public static void z(int n, int x, int y) {
		if(n == 1) {
			if(x == r && y == c) {
				System.out.println(count);
				flag = true;
			}
			count++;
			return;
		}
		
		if(flag) return;
		int s = n/2;
		
		z(s, x, y);
		z(s, x, y+s);
		z(s, x+s, y);
		z(s, x+s, y+s);
	}
	
}
