package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11653 {

	//백준 문제 11653 : 소인수분해
	static boolean[] prime = new boolean[10000001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue;
			for(int j=i*i ; j<prime.length ; j+=i) {
				prime[j] = true;
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=2 ; i<=n ; i++) {
			if(!prime[i]) {
				
				while(n % i == 0) {
					n /= i;
					sb.append(i).append("\n");
				}
			}
		}
		
		
		System.out.println(sb);
	}
}
