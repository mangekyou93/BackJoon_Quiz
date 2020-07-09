package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10799 {

	//���� ���� 10799 : �踷���
	//�з� : ����
	
	//1. ����⸦ ���ÿ� �ִ´�.	<<< �̰� ��� ����⸦ �־ ������ ������ check�� ��� �������ִ� ������ ��
	//2. �������� ���ÿ� �ִ´�.
	
	//�޸� : 17MB / �ð� : 0.136 s
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
