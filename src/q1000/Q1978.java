package q1000;

import java.util.Scanner;

public class Q1978 {

	//백준 문제 1978 : 소수 찾기
	//소수(Prime Number)란, 약수를 1과 자기자신만 같는 수 ex) 2, 3, 5, 7, 11, ...
	//소수가 중요한 이유는 "암호" 때문이라고 한다.
	//'RSA 암호화 방식' : 임의의 수들의 곱은 구하기 쉽지만 역으로 소인수 분해하는 것은 어렵다.
	//방법 1 : 2이상 N미만의 자연수로 나눈다. 		==> 시간복잡도 O(N)		:: N이하의 모든 소수를 구하는 방법 		==> 시간복잡도 O(N^2)
	//방법 2 : √N이하의 자연수로들로만 나누는 방법	==> 시간복잡도 O(√N)	:: N이하의 모든 소수를 구하는 방법		==> 시간복잡도 O(N√N)
	//방법 3 : 에라토스테네스의 체				==> 시간복잡도 O(NlogN)	:: N이하의 모든 소수를 구하는 방법		==> 시간복잡도 O(Nlog(logN))
	//에라토스테네스의 체란, k=2부터 √N이하까지 반복하여 자연수들 중 k를 제외한 k의 배수를 다 제외시킨다.
	
	//런타임에러가 뜨는 이유가 입력 받을 때 한번에 받고 안받고 차이인거 같은데 짜증나서 Scanner로 사용
	//소수 문제가 계속 나올예정이여서 에라토스테네스의 체는 다음 번에 사용하기로 함.
	//일단 방법1로 풀었음
	public static void main(String[] args) {
		
		//방법 1
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0 ; i<n ; i++) {
			int number = sc.nextInt();
			
			if(isPrime(number)) count++;
		}
		
		System.out.println(count);
		sc.close();
	}
	
	public static boolean isPrime(int number) {
		
		if(number < 2) return false;
		if(number == 2) return true;
		if(number == 3) return true;
		
		for(int i=2 ; i<number ; i++) {
			if(number % i == 0) return false;
		}
		return true;
	}

}
