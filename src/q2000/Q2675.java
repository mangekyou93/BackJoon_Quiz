package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {

	//백준 문제 2675 : 문자열 반복
	//메모리 : 13MB , 시간 : 0.072 s
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<t ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int r = 0;
			String s = "";
			while(st.hasMoreElements()) {
				r = Integer.parseInt(st.nextToken());
				s = st.nextToken();
			}
			
			for(int j=0 ; j<s.length() ; j++) {
				for(int k=0 ; k<r ; k++) {
					sb.append(s.charAt(j)+"");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
