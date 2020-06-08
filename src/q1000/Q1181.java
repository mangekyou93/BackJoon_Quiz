package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Q1181 {

	//백준 문제 1181 : 단어 정렬
	//메모리 : 33MB / 시간 : 0.36 s
	//중복은 아직도 HashSet 사용할 수밖에 없네..
	//Arrays.sort로 먼저 알파벳 순으로 정렬한 뒤
	//길이로 다시 append
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
 			
		for(int i=0 ; i<n ; i++) {
			hs.add(br.readLine());
		}
		
		//나는  HashSet을 String배열로 변경했지만,
		//다른 분들은 ArrayList로 변경.
		//그래서 Collections.sort를 사용함.
		String[] s = new String[hs.size()];
		int count = 0;
		for(String word : hs) {
			s[count] = word;
			count++;
		}
 		
 		Arrays.sort(s);
 		
 		for(int i=1 ; i<51 ; i++) {
 			for(int j=0 ; j<s.length ; j++) {
 				
 				if(s[j].length() == i) {
 					sb.append(s[j]).append("\n");
 				}
 			}
 		}
 		System.out.println(sb);
	}
}
