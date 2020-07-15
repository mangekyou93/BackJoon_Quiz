package programmers.level1;

public class SumOfDigit {

	//level 1
	//프로그래머스 문제 : 자릿수 더하기
	public static void main(String[] args) {
		
		int N = 987;
		
		int answer = 0;
		while(N > 0) {
			answer += N % 10;
			N /= 10;
		}
		
		System.out.println(answer);
	}
	
}
