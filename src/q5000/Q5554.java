package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5554 {

	//백준 문제 5554 : 심부름 가는 길
	//분류 : 구현
	//반복문이 코드는 짧지만, 메모리와 시간을 더 잡아먹는다.
	//하지만, 얼마 차이 안나는 시간임
	//0.004초, 메모리도 0.1MB 정도?
	//그래도 입력 데이터가 얼마냐에 따라 크게 차이날 것으로 예상
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		/*
		//메모리 : 12768KB / 시간 : 68ms
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int sum = a+b+c+d;
		
		int x = sum / 60;
		int y = sum % 60;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//메모리 : 12892KB / 시간 : 72ms
		int sum = 0;
		for(int i=0 ; i<4 ; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}
