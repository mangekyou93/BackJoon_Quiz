package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1700 {

	//백준 문제 1700 : 멀티탭 스케줄링
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		ArrayList<Integer> al = new ArrayList<Integer>();
		int K = Integer.parseInt(st.nextToken());
		boolean[] visited = new boolean[K];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(al.isEmpty()) al.add(arr[i]);
			
			if(al.size() < N) {
				if(!al.contains(arr[i])) al.add(arr[i]);
			} else {
				if(!al.contains(arr[i])) {
					Arrays.fill(visited, false);
				}
			}
		}
	}
}
