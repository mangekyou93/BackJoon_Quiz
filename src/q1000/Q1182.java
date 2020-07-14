package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {

	//백준 문제 1182 : 부분수열의 합
	
	//이건 솔직히 이해 안가서 다시해보는 것으로..
	static int N, S;
	static int[] arr;
	static int count = 0;
	static int currSum = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(count);
	}
	
	public static void dfs(int curr) {
		if(curr == N) return ;
		
		// 현재까지의 합이 S면 카운트 + 1
		if(currSum + arr[curr] == S) count++;
		
		// 이번 원소를 포함시키지 않고 시도
		dfs(curr + 1);
		
		// 이번 원소를 포함시키고 시도
		currSum += arr[curr];
		dfs(curr + 1);
		
		//마지막에 다시 이번 원소를 빼줘야 함
		currSum -= arr[curr];
	}
}
