package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818 {

	//백준 문제 10818 : 최소, 최대
	//2가지 배열 생성, 배열 노생성
	//배열을 생성하게되면 n의 범위가 1,000,000(백만)이라서 메모리 및 실행 시간을 너무 소요시킬 것으로 예상
	//그치만 소스는 금방 짤 수 있음 Arrays.sort();로 인하여
	public static void main(String[] args) {
		
		//배열 사용			메모리 : 118MB , 시간 : 1초
		//arrUse();
		
		//배열 미사용			메모리 : 110MB , 시간 : 0.48초
		//noArrUse();
	}
	
	static void arrUse() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int i = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
				i++;
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[0]+" "+arr[arr.length-1]);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void noArrUse() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int max = -1000001;
			int min = 1000001;
			
			while(st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				
				if(value < min) {
					min = value;
				}
				
				if(value > max) {
					max = value;
				}
			}
			
			sb.append(min+" "+max);
			System.out.println(sb);
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
