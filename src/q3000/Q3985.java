package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3985 {
	
	//백준 문제 3985 : 롤 케이크
	//분류 : 반복문
	//메모리 : 14MB / 시간 : 0.084 s
	//메모리 더 줄일 수 있는데 귀찮아서.... 더 많은 문제 풀어볼래 반복문이니까
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int max = Integer.MIN_VALUE;
		int num = 0;
		int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] cake = new int[L];
		int[] cnt = new int[1001];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for(int j=a-1 ; j<b ; j++) {
				if(cake[j] == 0) {
					cake[j] = i+1;
					cnt[i+1]++;
				}
			}
			
			if(b - a > max) {
				max = b - a;
				num = i+1;
			}
		}
		
		System.out.println(num);
		
		max = 0;
		int count = 0;
		for(int i=1 ; i<cnt.length ; i++) {
			
			if(cnt[i] > max) {
				max = cnt[i];
				count = i;
			}
		}
		
		System.out.println(count);
		
	}
}
