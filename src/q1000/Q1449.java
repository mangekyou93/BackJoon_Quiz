package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	//백준 문제 1449 : 수리공 항승
	//분류 : 그리디 알고리즘
	//메모리 : 13MB / 시간 : 0.084 s
	
	//내가 이해한게 맞았음
	//6에서 새는데 5.5랑 6.5만 막는게 말이 안되는데...
	//3.5 ~ 5.5
	//6.5 ~ 8.5
	//이건 틀린거임
	
	//5 2
	//4 5 6 7 8은 3개가 필요한게 맞음		::	2개로 절대로 막을 수 없음
	//3.5 ~ 5.5
	//5.5 ~ 7.5
	//7.5 ~ 9.5
	//이렇게 막는게 맞음
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] leak = new int[N];
		for(int i=0 ; i<N ; i++) {
			leak[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(leak);
		
		int range = leak[0];
		int tape = 1;
		
		for(int i=1 ; i<leak.length ; i++) {
			
			if(range + L - 1 < leak[i]) {			// i == 1 일때, 첫번째 시작 지점에서 4 + 2(테이프길이) - 1(좌 우 0.5씩 필요하니까) = 5
				range = leak[i];					// 5 < leak[2]이니까 range = leak[2] = 6
				tape++;								
			}
				
		}
		
		System.out.println(tape);
		
	}
}
