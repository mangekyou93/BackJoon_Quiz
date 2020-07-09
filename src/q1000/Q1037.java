package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {

	//백준 문제 1037 : 약수
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<a ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int n = arr[0] * arr[a-1];
		
		System.out.println(n);
	}
}
