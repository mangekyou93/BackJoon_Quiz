package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11729 {

	//백준 문제 11729 : 하노이 탑 이동 순서
	//하노이 문제는 대표적인 분할정복(divide-and-conquer) 문제
	//메모리 98MB / 시간 0.34 s
	//재귀함수라서 시간은 많이 소모됨.
	static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) throws Exception{

		//1 -> 1
		//2 -> 3
		//3 -> 7
		//4 -> 15
		//5 -> 31
		//2^n  - 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int k = (int)(Math.pow(2, n)) - 1;
		sb.append(k+"\n");
		
		//n은 탑의 층 수 / 1,2,3은 원판의 위치.
		//1 -> 3으로 이동하는 것을 뜻한다.
		hanoi(n,1,2,3);
		
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int from, int by, int to) {
		if(n == 1) {
			sb.append(from+" "+to+"\n");
			return ;
		}
		hanoi(n-1,from,to,by);
		sb.append(from+" "+to+"\n");
		hanoi(n-1,by,from,to);
	}

}
