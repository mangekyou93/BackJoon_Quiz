package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

	//백준 문제 1546 : 평균
	public static void main(String[] args) {
		
		
		//배열 있음
		//메모리 : 14MB / 시간 : 0.080 s
		//fail();
		
		//배열 없음
		//메모리 : 14MB / 시간 : 0.084 s 
		success();
	}
	
	
	static void fail() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			double max = 0;
			int index = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreElements()) {
				arr[index] = Integer.parseInt(st.nextToken());
				if(arr[index] > max) {
					max = arr[index];
				}
				index++;
			}
			double avr = 0;
			for(int i=0 ; i<arr.length ; i++) {
				
				avr += (arr[i]/max)*100;
			}

			System.out.println(avr/n);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void success() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int max = 0;
			int sum = 0;
			
			while(st.hasMoreElements()) {
				int score = Integer.parseInt(st.nextToken());
				
				if(score > max) {
					max = score;
				}
				
				sum += score;
			}
			
			double avg = 100.0 * sum / max / n;
			
			System.out.println(avg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
