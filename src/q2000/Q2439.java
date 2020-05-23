package q2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2439 {

	//백준 문제 2439 : 별 찍기 - 2
	//sysout, Scanner, 사용시 184ms / Buffer 사용시 84ms
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			for(int j=n ; j>0 ; j--) {
				bw.write(j <= i+1 ? "*" : " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
