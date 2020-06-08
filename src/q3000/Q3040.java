package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3040 {

	//백준 문제 3040 : 백설 공주와 일곱 난쟁이
	//분류 : 반복문
	//완전탐색인줄 알았는데 아니였음
	//1~9까지 더한 것에 - 100을 하면
	//나머지 값 = 두 난쟁이의 합
	//이 코드는 유일한 경우만 입력으로 주어지기 때문에 가능하다.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		int x=0,y=0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(sum - 100 == arr[i]+arr[j]) {
					x = i;
					y = j;
					System.out.println(x+" "+y);
				}
			}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(i != x && i != y) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}
