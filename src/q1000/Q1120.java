package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1120 {

	//백준 문제 : 문자열
	//분류 : 문자열 처리
	
	//말이 너무 애매함
	//이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.
	//A의 앞에 아무 알파벳이나 추가한다.
	//A의 뒤에 아무 알파벳이나 추가한다.
	//이때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.
	
	//이 말 뜻은
	//A = aaa , B = bbaaabb 일 때 
	//1. aaa, bba
	//2. aaa, baa
	//3. aaa, aaa
	//....
	//이런식으로 비교하라는 뜻이였음..
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int count = 0;
		int min = Integer.MAX_VALUE;
		if(A.length() == B.length()) {
			for(int i=0 ; i<A.length() ; i++) {
				if(A.charAt(i) != B.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			for(int i=0 ; i<=B.length()-A.length() ; i++) {
				String b = B.substring(i, A.length()+i);
				count = 0;
				for(int j=0 ; j<A.length() ; j++) {
					if(A.charAt(j) != b.charAt(j)) {
						count++;
					}
				}
				if(count < min) min = count;
			}
			System.out.println(min);
		}
	}
	
}
