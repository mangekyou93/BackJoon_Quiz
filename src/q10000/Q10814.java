package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {

	//백준 문제 10814 : 나이순 정렬
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[][] s = new String[n][2];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
		}
		
		/*
		//인터넷 코드
		//메모리 : 47MB / 시간 : 0.692 s
		//시간이 2배 가량 빠르다...
		Arrays.sort(s, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for(int i=0 ; i<n ; i++) {
			sb.append(s[i][0]).append(" ").append(s[i][1]).append("\n");
		}
		*/
		
		
		//내가 짠 코드
		//메모리 : 47MB / 시간 : 1.148 s
		//2중 for문으로 인한 시간 지연...
		//완전 탐색
		//이건 입력 순일때만 가능
		for(int i=1 ; i<=200 ; i++) {
			for(int j=0 ; j<n ; j++) {
				
				if(i == Integer.parseInt(s[j][0])) {
					sb.append(s[j][0]).append(" ").append(s[j][1]).append("\n");
				}
			}
		}
		
		
		System.out.println(sb);
	}

}
