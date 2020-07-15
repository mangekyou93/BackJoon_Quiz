package programmers.level1;

public class DistinguishIntegerSqrt {

	//level 1
	//프로그래머스 문제 : 정수 제곱근 판별
	
	//뭐하러 포문을 다 돌려보냐...
	//그냥 그거 루트 씌우고 제곱해서 맞으면 맞는건데ㅠㅠ
	public static void main(String[] args) {
		long n = 64;
		long answer = -1;
		
		for(long i=1 ; i<=Math.sqrt(n) ; i++) {
			if(i*i == n) {
				answer = (long)Math.pow(i+1, 2);
			}
		}
		
		System.out.println(answer);
	}
	
	
	//다른 사람 풀이
	public long solution(long n) {
		if(Math.pow(Math.sqrt(n)+1, 2) == n) {
			return (long)Math.pow(Math.sqrt(n)+1, 2);
		}
		
		return -1;
	}
	
}
