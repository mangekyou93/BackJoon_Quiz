package programmers.level1;

import java.util.Stack;

public class DartGame {

	//level 1
	//���α׷��ӽ� ���� : ��Ʈ ����
	//2018 KAKAO BLIND RECRUITMENT
	public static void main(String[] args) {
		String dartResult = "10T*10T*10T*";
		Stack<Integer> stack = new Stack<Integer>();
		
		int temp = 0;
		for(int i=0 ; i<dartResult.length() ; i++) {
			char ch = dartResult.charAt(i);
			
			if(ch >= 48 && ch <= 57) {								//����
				temp = ch - '0';
				if(temp == 1 && dartResult.charAt(i+1) == '0') {
					temp = 10;
					i++;
				}
			} else if(ch == 'S' || ch == 'D' || ch == 'T') {		//���ĺ�
				if(ch == 'D') temp = (int)Math.pow(temp, 2);
				else if(ch == 'T') temp = (int)Math.pow(temp, 3);
				stack.push(temp);
			} else {												//��Ÿ, ����
				if(ch == '*') {
					if(stack.size() == 1) {
						int a = stack.pop();
						stack.push(a * 2);
					} else {
						int a = stack.pop();
						int b = stack.pop();
						stack.push(b * 2);
						stack.push(a * 2);
					}
				} else {
					stack.push(stack.pop() * (-1));
				}
			}
		}
		
		int answer = 0;
		while(!stack.isEmpty()) {
			answer += stack.pop();
		}
		
		System.out.println(answer);
	}
	
}
