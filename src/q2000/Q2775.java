package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2775 {

	//백준 문제 2775 : 부녀회장이 될테야
	//피보나치 수열과 유사함
	//난 근데 문제를 읽어도 이해가 안됨.
	//1. 각 층의 1호에는 1명이 산다라는 말이 없음.
	//2. 0층 13호는 13명 이것만 이해가 됨 --> 0층의 i호에는 i명이 산다.
	//3. "a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다" --> 이 말이 즉 피보나치 수열임.
	
	// 1) 2차원 배열을 사용하면 2가지 방법이 있는데 처음 초기화시 for문으로 값을 넣어준다.						: for문을 여러번 사용, 전부 채워져 있어서 찾기만 하면됨.
	// 2) 공간만 만들어주고(단, 1 <= k <= 14, 1 <= n <= 14) 층 수와 호 수까지 계속 채워주면서 진행		: for문은 줄어들지만, 계속 채우면서 진행해야함
	// 3) 재귀함수를 통해 
	
	// 2차원 배열 / 재귀함수 공부하자.
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			testCase1(br);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void testCase1(BufferedReader br) throws Exception {
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];				//0층부터 14층까지이므로 15개
		
		for(int i=0 ; i<15 ; i++) {
			arr[0][i] = i+1;
			arr[i][0] = 1;
		}
		
		for(int i=1 ; i<15 ; i++) {
			for(int j=1 ; j<15 ; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}

		for(int i=0 ; i<t ; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(arr[k][n-1]+"\n");
		}
		System.out.println(sb);
	}

}
