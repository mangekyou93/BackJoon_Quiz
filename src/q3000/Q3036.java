package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3036 {

	//백준 문제 3036 : 링
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		
		while(st.hasMoreTokens()) {
			rotate(a, Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	
	public static void rotate(int a, int b) {
		int gcd = gcd(a,b);
		
		sb.append(a/gcd).append("/").append(b/gcd);
	}
	
	//유클리드 호제법(재귀)
	public static int gcd(int a, int b) {
		
		if(b == 0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
}
