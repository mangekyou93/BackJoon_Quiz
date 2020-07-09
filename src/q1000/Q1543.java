package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1543 {

	//백준 문제 1543 : 문서 검색
	//분류 : 문자열 처리
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String file = br.readLine();
		String find = br.readLine();
		int count = 0;

		
		while(file.contains(find)) {
			int a = file.indexOf(find);
			int b = find.length();
			
			if(a == 0) {
				count++;
				file = file.substring(b);
			}else {
				count++;
				file = file.substring(a+b, file.length());
			}
			
			//count++;
			//file = file.substring(a+b, file.length());
			//이렇게만 써도 괜찮음 
			//a == 0이면 a+b = b;
			
			//file = file.substring(a+b);
			//이것도 됨
		}
		
		System.out.println(count);
	}
}
