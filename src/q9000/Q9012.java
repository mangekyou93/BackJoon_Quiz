package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012 {

	//백준 문제 9012 : 괄호
	
	//이런 괄호나, 특정 문자열 삭제 같은건
	//스택을 쓰면 편함.
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String s = br.readLine();
			
			for(int i=0 ; i<s.length() ; i++) {
				char ch = s.charAt(i);
				
				if(ch == ')' && stack.empty()) {
					stack.push(")");
					break;
				} else {
					if(ch == '(') {
						stack.push("(");
					} else {
						stack.pop();
					}
				}
			}
			
			if(stack.empty()) {
				sb.append("YES");
			}else {
				sb.append("NO");
			}
			
			sb.append("\n");
			stack.clear();
		}
		
		System.out.println(sb);
	}
}
