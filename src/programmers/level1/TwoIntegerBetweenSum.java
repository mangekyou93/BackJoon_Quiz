package programmers.level1;

public class TwoIntegerBetweenSum {

	//level 1
	//프로그래머스 문제 : 두 정수 사이의 합
	
	//사실 이거는 수학문제
	//등차수열의 합 공식 사용하면 for문 없이 구할 수 있음
	//d(공차) : 1, a1(초항) : a,b중 작은 것
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		long answer = 0;
        
        int temp = Math.min(a, b);
        b = Math.max(a,b);
        a = temp;
        
        for(int i=a ; i<=b ; i++){
            answer += i;
        }
        //return answer;
        
        //다른 사람 풀이
        sumAtoB(Math.min(a, b), Math.max(a, b));
	}
	
	//다른 사람 풀이
	public static long sumAtoB(int a, int b) {
		
		return (b - a + 1) * (a + b) / 2;			//등차 수열의 합 공식  n(a + l) / 2		//n : 갯수, a : 초항, l : 마지막 항
													//n{2a + (n-1)d} / 2			//n : 갯수, a : 초항, d : 공차
	}
}
