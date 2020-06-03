package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

	//백준 문제 1712 : 손익분기점
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int cost = a+b;
		int count = 0;
		
		if(b >= c) {
			count = -1;
		} else {
			count = a / (c - b) + 1;
			/*
			//반복문은 시간이 더 소요된다
			//이거는 0.35초가 초과된다... 그래서 실패가 떳던거구나....
			while(cost > 0) {
				cost = cost + b - c;
				count++;
			}
			*/
		}
		
		System.out.println(count);
	}
}
