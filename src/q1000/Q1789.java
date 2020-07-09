package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1789 {
	
	//백준 문제 1789 : 수들의 합
	//분류 : 구현, 수학
	
	//재밌네 이건
	//100이면 1 ~ 13까지 더하면 91이고 100 - 91 하면 9니까
	//9는 이미 사용했으므로
	//1 ~ 12까지 더해주고, 9+13을 더해준다. 
	//그게 가장 많은 연산횟수가 나온다.
	
	//N은 서로 다른 수의 갯수를 의미하니까
	//연산횟수가 무조건 많아야함
	//그 뜻은 가장 작은 것부터 차례대로 더해가면 됨
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		long S = Long.parseLong(br.readLine());
		
		for(long i=1 ; S>0 ; i++) {
			S -= i;
			count++;
		}
		
		if(S < 0) {
			System.out.println(count-1);
		} else {
			System.out.println(count);
		}
	}
}
