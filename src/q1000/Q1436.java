package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1436 {
	
	//백준 문제 1436 : 영화감독 숌
	//브루트포스 문제
	//메모리 160MB / 시간 : 0.352 s
	//메모리를 쓴게 없는데 왜케 많이 나오지???
	//처음에는 666에 +1 이런시긍로 채울려다가 생각을 변경함.
	//결국 contains는 잘 돌아가는 거였고, 내가 코드를 잘못 짬... 반성하자..
	public static void main(String[] args) throws Exception {
		
		//1.  666	0
		//2.  1666	1
		//3.  2666	2
		//4.  3666	3
		//5.  4666	4
		//6.  5666	5
		//7.  6660	6
		//8.  6661	7
		//9.  6662	8
		//10. 6663	9
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = 666;
		int count = 0;
		
		while(true) {
			if(String.valueOf(a).contains("666")) {
				count++;
			}
			
			if(count == n) {
				System.out.println(String.valueOf(a));
				break;
			}
			
			a++;
		}
		
		/*
		 * 더 잘 짠코드
		int a = 665;
		while(n>0) {
			a++;
			if(String.valueOf(a).contains("666")) {
				n--;
			}
		}
		System.out.println(a);
		*/
	}

}
