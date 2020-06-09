package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3004 {
	
	//백준 문제  3004 : 체스판 조각
	//분류 : 반복문
	public static void main(String[] args) throws Exception {
		
		
		// 2 4 6 9 12 16 20 25 30 36 42 49 56 64 72 81 90 ....
		int[] arr = new int[101];
		arr[1] = 2;
		for(int i=2 ; i<arr.length ; i++) {
			arr[i] = arr[i-1] + (i / 2 + 1);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(arr[Integer.parseInt(br.readLine())]);
		
		
	}

}
