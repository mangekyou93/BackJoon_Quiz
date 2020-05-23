package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10039 {

	//백준 문제 10039 : 평균 점수
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		
		for(int i=0 ; i<5 ; i++){
			int a = 0;
			if((a = Integer.parseInt(br.readLine())) < 40) {
				total += 40;
			}else {
				total += a;
			}
		}
		System.out.println(total/5);
	}
}
