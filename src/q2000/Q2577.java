package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2577 {

	//백준 문제 2577 : 숫자의 개수
	//오래 걸릴줄 알았는데 for문이 1단계씩이라 O(N)임
	//그리고 배열을 2개나 사용해서 메모리는 배열 생성 안할때보다 많이 듬
	
	//아스키코드 30~39 == 0~9 이므로 charAt으로 했어도 무방함...
	//문자열,자릿수,아스키코드(char) 다루는 것이 많이 부족하다..
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 1;
		
		for(int i=0 ; i<3 ; i++) {
			int temp = Integer.parseInt(br.readLine());
			total = total * temp;
		}
		
		String[] word = String.valueOf(total).split("");
		int[] arr = new int[10];
		
		for(int i=0 ; i<word.length ; i++) {
			arr[Integer.parseInt(word[i])]++;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
