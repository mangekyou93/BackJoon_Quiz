package q11000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11021 {

	//백준 문제 11021 : A+B - 7
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=t ; i++) {
			String s = br.readLine();
			String[] word = s.split(" ");

			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			
			bw.write("Case #"+i+": "+(a+b)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
