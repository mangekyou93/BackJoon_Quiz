package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2217 {

	//백준 문제 2217 : 로프
	//분류 : 그리디 알고리즘
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//메모리 : 23MB / 시간 : 0.224 s
		//결론 비슷비슷하다
		int max = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			arr[i] = arr[i] * (N-i);
			if(max < arr[i]) max = arr[i];
		}
		System.out.println(max);
		
		/*
		//메모리 : 23MB / 시간 : 0.244 s
		for(int i=0; i<arr.length ; i++) {
			arr[i] = arr[i] * (arr.length-i);
		}

		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		*/
	}
}
