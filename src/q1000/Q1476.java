package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476 {

	//백준 문제 1476 : 날짜 계산
	//분류 : 수학
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int count = 1;
		int eCount = 1;
		int sCount = 1;
		int mCount = 1;
		boolean check = true;
		
		while(check) {
			if(eCount > 15) eCount = 1;
			if(sCount > 28) sCount = 1;
			if(mCount > 19) mCount = 1;
			
			if(eCount == E && sCount == S && mCount == M) {
				check = false;
				System.out.println(count);
			}
			
			eCount++;
			sCount++;
			mCount++;
			count++;
		}
	}
	
}
