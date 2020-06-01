package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2941 {
	
	//백준 문제 2941 : 크로아티아 알파벳
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String s = br.readLine().trim();
		
		
		for(int i=0 ; i<word.length ; i++) {
			s = s.replaceAll(word[i], "a");
		}
		
		System.out.println(s.length());
		br.close();
	}
}
