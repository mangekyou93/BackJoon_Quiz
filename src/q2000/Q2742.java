package q2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q2742 {

	//���� ���� 2742 : ���� N
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=n ; i>0 ; i--) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
