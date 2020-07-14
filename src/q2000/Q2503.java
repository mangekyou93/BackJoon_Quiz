package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2503 {

	//백준 문제 2503 : 숫자 야구
	//분류 : 브루트 포스
	
	//123 ~ 987까지 조사함
	//근데 130이나 133 이런거는 제외해야함
	//메모리 : 13MB / 시간 : 0.084 s
	static int values[], strikes[], balls[];
	static int N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		values = new int[N];
		strikes = new int[N];
		balls = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int value = Integer.parseInt(st.nextToken());
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			values[i] = value;
			strikes[i] = strike;
			balls[i] = ball;
		}
		
		int answer = 0;
		
		
		for(int i=123 ; i<=987 ; i++) {
			if(baseball(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	public static boolean baseball(int n) {
		int h = n / 100;			// 백의 자리
		int t = (n % 100) / 10;		// 십의 자리
		int o = n % 10;				// 일의 자리
		
		if(h == 0 || t == 0 || o == 0) return false;		// 0이 있으면 false
		if(h == t || h == o || t == o) return false;		// 중복이 있으면 false
		
		//물음과 대답이 있는 만큼 for문을 돌림.
		//거기서 서로 비교하면서 strike와 ball의 갯 수를 구해서 일치하는지 체크
		//일치하면 다음 숫자로 넘어가고, 불일치하면 다음 숫자를 체크하러 baseball밖으로 나감
		for(int i=0 ; i<N ; i++) {
			int v = values[i];
			int strike = 0, ball = 0;
			int hv = v / 100;
			int tv = (v % 100) / 10;
			int ov = v % 10;
			
			if(h == hv) strike++;
			if(t == tv) strike++;
			if(o == ov) strike++;
			
			if(h == tv || h == ov) ball++;
			if(t == hv || t == ov) ball++;
			if(o == hv || o == tv) ball++;
			
			if(strike != strikes[i] || ball != balls[i]) {
				return false;
			}
		}
		
		return true;
	}
}
