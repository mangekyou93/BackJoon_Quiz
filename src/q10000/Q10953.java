package q10000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10953 {

	//백준 문제 10953 : A+B - 6
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String text = br.readLine();
			String[] word = text.split(",");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			
			bw.write((a+b)+"\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
