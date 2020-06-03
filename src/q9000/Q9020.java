package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9020 {

	//백준 문제 9020 : 골드바흐의 추측
	//메모리 : 46MB / 시간 : 0.368 s			:: 시간이 많이 나옴
	public static void main(String[] args) throws Exception {

		//여기서 중요한 포인트는 만약 정답이 여러개일 경우 두 소수의 차가 작은 것을 출력하라고 했다.
		//메모리 : 15MB / 시간 : 0.116 s			:: 확실히 빠름, 변수도 first_patition, second_partition 2개만 만들어서 메모리도 절약
		strangerCoding();
		
		//내 소스
		//메모리 : 46MB / 시간 : 0.368 s			:: 시간이 많이 나옴	=	if문도 많고, 전체 조회를 해야해서
		//myCoding();
		
	}
	
	public static void strangerCoding() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//에라토스테네스의 체
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {							//이렇게도 쓸 수 있다는게 그저 신기함..
			int n = Integer.parseInt(br.readLine());
			int first_partition = n / 2;
			int second_partition = n / 2;
			
			while(true) {
				//n=12이면
				//6+6 = 12		false,	차이 0	:: x
				//5+7 = 12		true, 	차이 2	:: o
				//4+8 = 12		false,	차이 4	:: x
				//3+9 = 12		false,	차이 6	:: x
				//2+10= 12		false,	차이 8	:: x
				//두 파티션이 모두 소수 일 경우
				if(!prime[first_partition] && !prime[second_partition]) {
					sb.append(first_partition).append(" ").append(second_partition).append("\n");
					break;
				}
				first_partition--;
				second_partition++;
			}
		}
		System.out.println(sb);
		br.close();
	}
	
	public static void myCoding() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//에라토스테네스의 체
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<=Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = 0;
			String s = "";
			
			for(int j=2 ; j<n ; j++) {
				if(!prime[j]) {
					if(n - j > 1) {
						a = n - j;
						if(a-j >= 0 && !prime[a]) {
							s = j+" "+a;
						}
					}
				}
			}
			sb.append(s+"\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
