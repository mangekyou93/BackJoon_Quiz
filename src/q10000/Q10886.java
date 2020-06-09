package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10886 {

	//백준 문제 10886 : 0 = not cute / 1 = cute
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[2];
		
		while(n-- > 0) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		System.out.println(arr[0] > arr[1] ? "Junhee is not cute!" : "Junhee is cute!");
	}
}
