package programmers.level1;

public class FindPrime {

	//level 1
	//프로그래머스 문제  : 소수 찾기
	//에라토스테네스의 체 사용
	public static void main(String[] args) {
		int n = 10;
		boolean[] prime = new boolean[n+1];
		prime[0] = true;
		prime[1] = true;
		for(int i=2 ; i<=Math.sqrt(n) ; i++){
		    if(prime[i]) continue;
		    for(int j=i*i ; j<=n ; j+=i){
		        prime[j] = true;
		    }
		}
		
		int answer = 0;
		for(int i=2 ; i<=n ; i++){
		    if(!prime[i]) answer++;
		}
		  
		System.out.println(answer);
	}
}
