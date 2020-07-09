package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986 {

	//백준 문제 3986 : 좋은 단어
	//분류 : 문자열 처리, 스택
	
	//메모리 : 20MB / 시간 : 0.248 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack;
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(N-- > 0) {
			stack = new Stack<Character>();
			String s = br.readLine();
			
			for(int i=0 ; i<s.length() ; i++) {
				char ch = s.charAt(i);
				
				if(stack.empty() || stack.peek() != ch) {
					stack.push(ch);
				} else {
					stack.pop();
				}
			}
			
			if(stack.empty()) count++;
		}
		
		System.out.println(count);
	}
	
}
