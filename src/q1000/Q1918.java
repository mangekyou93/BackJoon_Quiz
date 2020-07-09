package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1918 {

	//백준 문제 1918 : 후위 표기식
	//분류 : 스택
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		
		String s = br.readLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if((int)ch >= 65 && (int)ch <= 90) {
				sb.append(ch);
				
			} else if(ch == '*' || ch == '/') {
				while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
					sb.append(stack.pop());
				}
				stack.push(ch);
				
			} else if(ch == '+' || ch == '-') {
				while(!stack.empty() && (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')) {
					sb.append(stack.pop());
				}
				stack.push(ch);
				
			} else if(ch == '(') {
				stack.push(ch);
			} else if(ch == ')') {
				while(stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			
		}
		
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
		
	}
}
