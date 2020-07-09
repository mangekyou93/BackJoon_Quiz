package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3034 {

	//백준 문제 3034 : 앵그리 창영
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
		int a = W*W + H*H;
		
		while(N-- > 0) {
			int b = Integer.parseInt(br.readLine());
			
			if(b*b <= a) {
				sb.append("DA").append("\n");
			}else {
				sb.append("NE").append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
}
