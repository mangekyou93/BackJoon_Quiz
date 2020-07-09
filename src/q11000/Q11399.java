package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {
	
	//백준 문제 11399 : ATM
	
	//그리디 알고리즘
	//풀었는데 왜케 어렵게 생각하지??
	//회의실배정처럼 막 그렇게 고민하지 않아도 되는건데
	//그리디라고 생각하니까 어렵게 생각하나보다
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=1 ; i<N ; i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
}
