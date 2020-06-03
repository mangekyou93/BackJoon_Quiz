package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 {

	//백준 문제 1929 : 소수 구하기
	//전역변수로 prime을 구해볼 예정
	//에라토스테네스의 체에 대한 이중 for문을 아직 제대로 구현하지 못함.
	//전역변수로 prime을 구하면 약간 빠름.
	//하지만 메서드로 나누면 가독성에 엄청 편리하다.
	static boolean[] prime = new boolean[1000001];
	
	public static void main(String[] args) throws Exception {
		
		//메모리 : 26MB / 시간 : 0.192 s
		getPrime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m ; i<=n ; i++) {
			if(!prime[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
		br.close();
		
		/*
		//메모리 : 28MB / 시간 : 0.2 s
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//에라토스테네스의 체 : 소수 찾기
		boolean[] prime = new boolean[1000001];
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for( int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=m ; i<=n ; i++) {
			if(!prime[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
		br.close();
		*/
	}
	
	static void getPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for( int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
	}

}
