package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1764 {

	//백준 문제 1764 : 듣보잡
	//분류 : 구현
	//메모리 : 28MB / 시간 : 0.248 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> arr = new ArrayList<String>();
		
		 for(int i=0 ; i<N ; i++) {
			hs.add(br.readLine());
		 }
		 
		 for(int i=0 ; i<M ; i++) {
			 String s = br.readLine();
			 if(hs.contains(s)) {
				 arr.add(s);
			 }
		 }
		 
		 Collections.sort(arr);
		 sb.append(arr.size()).append("\n");
		 
		 for(int i=0 ; i<arr.size() ; i++) {
			 sb.append(arr.get(i)).append("\n");
		 }
		 
		 System.out.println(sb);
	}
}
