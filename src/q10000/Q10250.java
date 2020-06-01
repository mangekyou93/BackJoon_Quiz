package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {

	//백준 문제 10250 : ACM 호텔
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int floor = 0;
			int ho = 0;
			
			//ex) h == 6, w == 12, n == 10
			//n % h == 0이면 +0, 0이 아니면 +1
			if(h == 1) {
				floor = 1;
				ho = n;
			}else if(n % h == 0) {
				ho = n / h;
				//n <  h -> n % h가 층 수가 된다.
				//n >= h -> h가 층 수가 됨
				//★★★★★★ 어디까지나 n % h == 0 일 때 ★★★★★★
				floor = n >= h ? h : n % h;				//여기서 좀 막힘
			} else {
				ho = n / h + 1;
				floor = n % h;
			}
			
			if(ho < 10) {
				sb.append(floor+"0"+ho);
			}else {
				sb.append(floor+""+ho);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
