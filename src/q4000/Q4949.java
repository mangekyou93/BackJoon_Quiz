package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {

	//백준 문제 4949 : 균형잡힌 세상
	//분류 : 문자열 처리
	
	//미쳤다 이거 스택쓰면 편함
	//이럴때 스택쓰는거구나...
	//값을 계속 묶고 있어야할 때?
	//큐랑 스택이랑 원리는 알고 있었지만, 어쩔때 사용하는건지 몰랐는데
	//메모리 : 18MB / 시간 : 0.184 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		
		String str;
		while(!((str = br.readLine()).equals("."))) {
			stack.clear();
			for(int i=0 ; i<str.length() ; i++) {
				char ch = str.charAt(i);
				if(ch == '(' || ch == '[') {
					stack.push(str.charAt(i));
				} else if (ch == ')' || ch == ']') {
					if(stack.isEmpty() || (stack.peek() == '(' && ch == ']') || (stack.peek() == '[' && ch == ')')) {
						stack.push(ch);		// 괄호 순서가 이상하거나, 닫는 괄호가 먼저 나오거나 하면 break;
						break;
					}
					stack.pop();			// 그게 아니라면 짝이 맞아서 pop
				}
			}
			
			sb.append(stack.isEmpty() ? "yes" : "no").append("\n");
		}
		
		System.out.println(sb);
	}
	
}
