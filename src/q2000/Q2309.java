package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309 {

	//백준 문제 2309 : 일곱 난쟁이
	//분류 : 브루트 포스 
	
	//이거 하나 푸는데 무슨 40분을 써버리네...
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[101];
		int sum = 0;
		
		for(int i=0 ; i<9 ; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a] = true;
			sum += a;
		}
		
		sum = sum - 100;
		boolean check = false;
		
		for(int i=1 ; i<arr.length ; i++) {
			if(!arr[i]) continue;
			for(int j=1 ; j<arr.length ; j++) {
				if(!arr[j]) continue;
				if(i + j == sum) {
					arr[i] = false;
					arr[j] = false;
					check = true;
					break;
				}
			}
			if(check) break;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			if(!arr[i]) continue;
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
