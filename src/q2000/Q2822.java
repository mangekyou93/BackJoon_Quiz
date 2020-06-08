package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2822 {

	//백준 문제 2822 : 점수 계산
	//분류 : 반복문
	//메모리 : 13MB / 시간 : 0.068 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[151];
		int[] numArr = new int[5];
		
		for(int i=0 ; i<8 ; i++) {
			arr[Integer.parseInt(br.readLine())] = i+1;
		}
		
		int sum = 0;
		int count = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			
			if(count == 5) break;
			
			if(arr[i] != 0) {
				sum += i;
				numArr[count] = arr[i];
				count++;
			}
		}
		
		Arrays.sort(numArr);
		sb.append(sum).append("\n");
		for(int i=0 ; i<numArr.length ; i++) {
			sb.append(numArr[i]).append(" ");
		}
		System.out.println(sb);
	}

}
