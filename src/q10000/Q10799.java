package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {

	//백준 문제 10799 : 쇠막대기
	//분류 : 스택
	
	//1. 막대기를 스택에 넣는다.	<<< 이걸 사용 막대기를 넣어서 레이저 만나면 check를 계속 변경해주는 식으로 함
	//2. 레이저를 스택에 넣는다.
	
	//메모리 : 17MB / 시간 : 0.136 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		String s = br.readLine();
		boolean check = true;
		int count = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if(check) {
				if(ch == ')') {
					stack.pop();
					count++;
				} else {
					stack.push(ch);
					check = false;
				}
			} else {
				if(ch == ')') {
					stack.pop();
					count += stack.size();
					check = true;
				} else {
					stack.push(ch);
				}
			}
		}
		
		System.out.println(count);
	}
	
}
