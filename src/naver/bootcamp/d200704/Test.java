package naver.bootcamp.d200704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {
	
	static String[] name_list;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = st.countTokens();
		name_list = new String[n];
		for(int i=0 ; i<n ; i++) {
			name_list[i] = st.nextToken();
		}
		
		System.out.println(check());
	}
	
	
	public static boolean check() {
		
		for(int i=0 ; i<name_list.length ; i++) {
			for(int j=i+1 ; j<name_list.length ; j++) {
				if(name_list[j].contains(name_list[i])) {
					return true;
				}
			}
		}
		
		return false;
	}
}
