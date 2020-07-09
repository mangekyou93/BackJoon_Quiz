package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {

	//백준 문제 2630 : 색종이 만들기
	
	//분할 정복
	//색종이를 계속 반씩 잘라서
	//그 안에 들어있는게 전부 파란색, 전부 하얀색이냐 고르는 문제
	//문제가 정확히 양분할 수 있으면 분할 정복 문제라고 인식해야함.(꼭 양분이 아니더라도, 최소한으로 쪼갤 수 있다면)
	//분할단계, 정복단계가 있음
	//N=1까지 나눠졌으면 정복단계를 실행
	//더 분할할 수 있다면 분할단계를 실행
	static boolean[][] paper;
	static int white = 0, blue = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		paper = new boolean[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; st.hasMoreTokens() ; j++) {
				if(st.nextToken().equals("1")) {
					paper[i][j] = true;					//true == 블루 == 1
					continue;
				} 
			}
		}
		
		getColor(N, 0, 0);
		System.out.println(white);
		System.out.println(blue);
	}
	
	static void getColor(int n, int x, int y) {
		if(isSame(n,x,y)) {								//정복 단계
			if(!paper[y][x])white++;
			else blue++;
			return;
		}

		getColor(n/2, x, y);							//분할 단계
		getColor(n/2, x+n/2, y);
		getColor(n/2, x, y+n/2);
		getColor(n/2, x+n/2, y+n/2);
	}
	
	static boolean isSame(int n, int x, int y) {
		boolean criteria = paper[y][x];
		for(int i=y ; i<y+n ; i++) {
			for(int j=x ; j<x+n ; j++) {
				if(criteria != paper[i][j]) return false;
			}
		}
		return true;
	}
}
