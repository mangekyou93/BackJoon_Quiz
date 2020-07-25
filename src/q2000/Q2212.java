package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2212 {

	//백준 문제 2212 : 센서
	//메모리 : 17MB / 시간 : 0.136 s
	
	//이해하기 진짜 어려운 문제
	//집중국을 직선이라고 생각하면
	//5개의 집중국이면 4개의 빈 공간이 생김.		:: K-1개의 빈 공간
	//각 거리의 차이를 구해서				:: distance 배열
	//큰 것부터 빈 공간만큼을 없애줌			:: len
	
	//그리고나서 차이를 len길이 까지 더해주면 최솟값이 됨.
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int[] distance = new int[N-1];
		for(int i=0 ; i<distance.length ; i++) {
			distance[i] = Math.abs(arr[i+1] - arr[i]);
		}
		Arrays.sort(distance);
		
		int len = distance.length - (K-1);
		int sum = 0;
		for(int i=0 ; i<len ; i++) {
			sum += distance[i];
		}
		
		System.out.println(sum);
	}
}
