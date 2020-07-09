package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11401 {

	//백준 문제 11401 : 이항 계수 3
	//파스칼의 정리는 시간 초과
	//애초에 dp로는 메모리가 부족함. dp[4000000][4000000] => 4백만 * 4백만
	//이항 계수를 1000000007로 나눈 나머지
	//1 <= N <= 4000000 , 0 <= K <= N
	//일단 이항계수는 팩토리얼 또는 파스칼의 삼각형(DP)로 구할 수 있다.
	
	//페르마의 소정리를 이용해야하는 문제.. 어렵다
	//a^p-1 % p = 1		: p는 소수 
	
	//확장 유클리드 호제법이나 페르마의 소정리를 이용하는 문제인데
	//진짜 이해가 안간다...
	//역원은 또 뭐냐고요..
	static long d = 1000000007;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
	}
	
}
