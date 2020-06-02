package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1011 {

	//백준 문제 1011 : Fly me to the Alpha Centauri
	//문제가 어려워도 끝까지 물고 늘어지자.
	//수학문제는 빨리 규칙을 찾는 것이 중요하다	->	그러니 공책으로 계속 규칙을 찾자.
	//반복문은 사용하되 왠만하면 사용하지 않아야 속도가 잘 나온다.
	public static void main(String[] args) throws Exception {
		
		//0 -> 1  : 1			(1번)
		//0 -> 2  : 1 1			(2번)
		//0 -> 3  : 1 1 1		(3번)
		//0 -> 4  : 1 2 1		(3번)
		//0 -> 5  : 1 2 1 1		(4번)
		//0 -> 6  : 1 2 2 1		(4번)
		//0 -> 7  : 1 2 2 1 1	(5번)
		//0 -> 8  : 1 2 2 2 1	(5번)
		//0 -> 9  : 1 2 3 2 1	(5번)
		//0 -> 10 : 1 2 3 2 1 1	(6번)
		//0 -> 11 : 1 2 3 2 2 1	(6번)
		//0 -> 12 : 1 2 3 3 2 1 (6번)
		//.
		//.
		//.
		//규칙을 찾다보면 4, 9, 16, ... 에서 max가 바뀌고 /카운트 횟 수의 분기점이 됨.
		//규칙을 빨리 찾자!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dis = y - x;
			
			int max = (int)Math.sqrt(dis);
			
			if(max == Math.sqrt(dis)) {
				sb.append(max * 2 - 1);
			} else if(dis <= max * max + max) {
				sb.append(max * 2);
			} else {
				sb.append(max * 2 + 1);
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
