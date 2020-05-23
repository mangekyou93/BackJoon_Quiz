package q2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2438 {

	//백준 문제 2438 : 별 찍기 - 1
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<=i ; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
