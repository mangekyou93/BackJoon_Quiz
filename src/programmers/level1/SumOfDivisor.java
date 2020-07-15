package programmers.level1;

public class SumOfDivisor {

	//level 1
	//프로그래머스 문제 : 약수의 합
	public static void main(String[] args) {
		int n = 10;
		
		int answer = 0;
		for(int i=1 ; i<=n ; i++) {
			if(n % i == 0) answer += i;
		}
		
		System.out.println(sumDivisor(n));
	}
	
	//다른 사람 코드
	public static int sumDivisor(int n) {
		
		int answer = 0;
		for(int i=1 ; i<=Math.sqrt(n) ; i++) {
			if(n % i == 0) {
				answer += (i + (n / i));
			}
		}
		
		return answer;
	}
}
