package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4796 {

	//백준 문제 4796 : 캠핑 
	//분류 : 그리디 알고리즘
	
	//모든 입력 정수는 int범위이다.
	//이 말은 연산 횟수가 엄청 날 것이니까, 최대한 반복문은 피해야 한다.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int index = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int L = 0;
			
			if((L = Integer.parseInt(st.nextToken())) == 0) break;
			
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			int count = (V/P)*L;
			V %= P;
			count += V > L ? L : V;
			
			sb.append("Case ").append(index).append(": ").append(count).append("\n");
			index++;
		}	
		
		System.out.println(sb);
	}
}
