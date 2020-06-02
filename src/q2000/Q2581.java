package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2581 {

	//백준 문제 2581 : 소수
	//방법 2 : √N이하의 자연수로들로만 나누는 방법	==> 시간복잡도 O(√N)	:: N이하의 모든 소수를 구하는 방법		==> 시간복잡도 O(N√N)
	//방법 3 : 에라토스테네스의 체				==> 시간복잡도 O(NlogN)	:: N이하의 모든 소수를 구하는 방법		==> 시간복잡도 O(Nlog(logN))
	
	//에라토스테네스의 체는 문자열 다룰때처럼 boolean 배열을 사용한다.
	public static void main(String[] args) throws Exception{
		
		//방법2는 시간 초과 나온다..
		//method2();
		
		//방법3 : 에라토스테네스의 체
		method3();
	}
	
	public static void method3() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[n+1];							//0~n까지니까 +1을 해준다
		prime[0] = true;											//0은 소수가 아니다 : true 소수가 아닌 수
		prime[1] = true;											//1은 소수가 아니다 : true 소수가 아닌 수
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {			//i = 2이면 4 6 8 10.... 2의 배수 전부 소수가 아닌 수(true)로 변경
				prime[j] = true;									
			}
		}
		
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = m; i <= n; i++) {
			if(prime[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	public static void method2() throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int min = 10001;
		int sum = 0;
		
		while(m<=n) {
			boolean check = true;
			
			if(m == 1) continue;
			
			for(int i=2 ; i<=Math.sqrt(m) ; i++) {
				if(m % i == 0) {
					check = false;
					break;
				}
			}
			
			if(check) {
				if(m < min) {
					min = m;
				}
				sum += m;
			}
			m++;
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
