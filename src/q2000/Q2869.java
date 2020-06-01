package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

	//백준 문제 2869 : 달팽이는 올라가고 싶다
	public static void main(String[] args) throws Exception{
		
		// 1 ≤ B < A ≤ V ≤ 1,000,000,000
		//시간 제한 0.15 s == 150 ms 안에 끝내야함 : 반복문을 안쓰는 것으로 추정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int height = v - a;
		int count = 0;
		
		//성공
		//메모리 : 13MB / 시간 : 0.68 s
		//반복문을 안쓰는 것이 중요함
		//문제 1712 손익 분기점과 비슷한 문제
		if(height % (a-b) != 0) {
			count = height/(a-b) + 2;
		} else {
			count = height/(a-b) + 1;
		}
		
		System.out.println(count);
		
		
		/*
		//실패 사유 : 시간 초과
		while(true) {
			height += a;
			count++;
			if(height >= v) {
				System.out.println(count);
				break;
			}
			height -= b;
		}
		*/
	}

}
