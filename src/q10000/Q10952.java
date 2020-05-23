package q10000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10952 {

	//백준 문제 10952 : A+B - 5
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			
			if(a+b == 0) {
				break;
			}
			bw.write((a+b)+"\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
