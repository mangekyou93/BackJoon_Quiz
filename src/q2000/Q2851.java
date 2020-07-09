package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2851 {

	//백준 문제 2851 : 슈퍼 마리오
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10];
		int sum = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			sum += Integer.parseInt(br.readLine());
			arr[i] = sum;
		}
		
		int index = 0;
		for(int i=0 ; i<arr.length ; i++) {
			
			if(arr[i] >= 100) {
				if(i != 0) {
					if(arr[i] - 100 > 100 - arr[i-1]) {
						index = i-1;
					}else {
						index = i;
					}
				} else {
					index = 0;
				}
				break;
			} else {
				index = 9;
			}
		}
		
		System.out.println(arr[index]);
	}
}
