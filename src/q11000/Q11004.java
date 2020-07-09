package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q11004 {

	//백준 문제 11004 : K번째 수
	//분류 : 정렬
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
 		}
		
		//시간초과
		//Arrays.sort(arr);
		
		quickSort(arr, 0, N-1);
		System.out.println(arr[K-1]);
		
		/*
		//ArrayList 사용
		//Collections.sort 사용
		//메모리 : 584MB / 시간 3.644 s			//시간 2초 이내 , 메모리 512MB 이내
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0 ; i<N ; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(arr);
		
		System.out.println(arr.get(K-1));
		*/
	}
	
	//퀵정렬 시간초과?
	public static void quickSort(int[] arr, int start, int end) {
		if(start < end) {
			int t = partition(arr, start, end);
			quickSort(arr, start, t-1);
			quickSort(arr, t+1 , end);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int idx = start-1;
		
		for(int i=start ; i<end ; i++) {
			if(arr[i] < pivot) swap(arr, ++idx, i);
		}
		
		swap(arr, ++idx, end);
		return idx;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
