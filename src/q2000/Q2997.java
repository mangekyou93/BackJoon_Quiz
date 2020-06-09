package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2997 {

	//백준 문제 2997 : 네 번째 수
	//분류 : 반복문
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[3];
		
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
			
		int d1 = arr[2] - arr[1];
		int d2 = arr[1] - arr[0];
		
		if(d1 == d2) {
			System.out.println(arr[2] + d1);
		} else {
			if(d1 < d2) {
				System.out.println(arr[0] + d1);
			}else {
				System.out.println(arr[1] + d2);
			}
		}
		
	}

}
