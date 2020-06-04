package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2231 {

	//백준 문제 2231 : 분해합
	//브루트포스
	//각 자릿수의 합이 미쳤다...
	//0에서 쭉쭉 생성자를 찾으면서 찾으면 break는 생각했었는데...
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0 ; i<N ; i++) {
			int number = i;
			int sum = 0;
			
			//이건 꼭 알아놓자...
			//각 자릿 수의 합을 구하는 while문
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}

}
