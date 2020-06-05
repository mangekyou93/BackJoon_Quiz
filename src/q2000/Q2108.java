package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2108 {

	//백준 문제 2108 : 통계학
	//최빈값, 중앙값을 구하지 못함..
	//이것도 카운팅 정렬을 이용해서 문제를 해결
	//이런 배열이 자주 쓰인다. boolean[]으로 하기도 하고, int[]로 하기도 함
	public static void main(String[] args) throws Exception{
		
		//산술평균 : N개의 수들의 합을 N으로 나눈 값
		//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		//최빈값 : N개의 수들 중 가장 많이 나타나는 값
		//범위 : N개의 수들 중 최댓값과 최솟값의 차이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sAvg = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[8001];
		
		for(int i=0 ; i<n ; i++) {
			int value = Integer.parseInt(br.readLine());
			sAvg += value;
			arr[value + 4000]++;
			
			if(value < min) {
				min = value;
			}
			if(value > max) {
				max = value;
			}
		}
		
		
		int median = 10000;
		int mode = 10000;
		boolean flag = false;
		
		int count = 0;
		int mode_max = 0;
		
		for(int i=min+4000 ; i<=max+4000 ; i++) {
			
			//카운트가 0 인 것 제외
			//ex) -3 -1이면 arr[3998] == 0 이기 때문에 if을 통과하지 않음
			if(arr[i] > 0) {
				//중앙값 찾기
				//-1 -1 -1 -1 0 1 1 1 1
				if(count < (n+1) / 2) {
					count += arr[i];
					median = i - 4000;
				}
				
				
				//최반값 찾기 
				// ex) -4 -3 -3 -2 -1 -1 1 1
				// -1에서 flag가 false가 되고,
				// 1에서는 if문을 통과하지 않는다.
				// ex) -4 -3 -3 -2 -1 -1 1 1 1
				// 이 경우는 1에서 flag가 다시 true가 된 후에는 최빈값 조건을 만족하는 수가 더이상 없음.
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		sb.append((int)Math.round((double)sAvg/n)).append("\n");
		sb.append(median).append("\n");
		sb.append(mode).append("\n");
		sb.append(max - min);
		System.out.println(sb);
	}

}
