package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1449 {

	//백준 문제 1449 : 수리공 항승
	//분류 : 그리디 알고리즘
	
	
	//길이가 2인 테이프로
	//5곳 4 5 6 7 8를 막는다고 하면
	//0.5씩 추가로 막아야하니까
	//3.5 ~ 5.5		: 1개
	//5.5 ~ 7.5		: 2개
	//7.5 ~ 9.5		: 3개
	//이렇게 써야하는거 아닌가??
	
	//풀이
	//3.5 ~ 5.5		: 1개		5.5까지 막았는데 6을 생략한다.
	//6.5 ~ 8.5		: 2개
	
	//이해가 안됨
	//적어도 그 위치의 좌우 0.5만큼 간격을 줘야 물이 다시는 안 샌다고 생각한다.	:	물이 새는곳이 6인데 5.5랑 6.5를 막아도 6에서 물이 안샌다는 뜻인가..?
	//이 말 뜻은 6에서 새면 5.5 ~ 6.5는 막아야 6에서 물이 안샌다는거 아님?
	//양쪽을 묶어버린다고 생각하면 6으로 지나가질 않는데 물이?
	//뭔 개소리지?
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
		
		int range = (int)(leak[0] - 0.5 + L);
		int tape = 1;
		
		for(int i=1 ; i<leak.length ; i++) {
			
			if(range < (int)(leak[i] - 0.5)) {
				range = (int)(leak[i] - 0.5 + L);
				tape++;
			}
				
		}
		
		System.out.println(tape);
		
	}
}
