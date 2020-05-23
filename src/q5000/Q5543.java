package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5543 {

	//백준 문제 5543 : 상근날드
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 2001;
		int b = 2001;
		int temp = 0;
		
		for(int i=0 ; i<5 ; i++) {
			if(i<3) {
				temp = Integer.parseInt(br.readLine());
				if(temp < a) {
					a = temp;
				}
				
			} else {
				temp = Integer.parseInt(br.readLine());
				if(temp < b) {
					b = temp;
				}
			}
		}
		
		System.out.println(a+b-50);
	}
}
