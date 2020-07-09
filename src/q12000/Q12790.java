package q12000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12790 {

	//백준 문제 12790 : Mini Fantasy War
	//분류 : 구현
	//메모리 : 14MB / 시간 : 0.1 s
	//시간이 생각보다 많이나옴
	//연산횟수를 줄이도록 해야함
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int hp = 0;
			int mp = 0;
			int off = 0;
			int def = 0;
			
			for(int i=0 ; i<2 ; i++) {
				hp += Integer.parseInt(st.nextToken());
				mp += Integer.parseInt(st.nextToken());
				off += Integer.parseInt(st.nextToken());
				def += Integer.parseInt(st.nextToken());
			}
			
			hp = hp < 1 ? 1 : hp;
			mp = mp < 1 ? 1 : mp;
			off = off < 0 ? 0 : off;
			
			int power = hp*1 + mp*5 + off*2 + def*2;
			
			sb.append(power).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
