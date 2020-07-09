package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949 {

	//���� ���� 4949 : �������� ����
	//�з� : ���ڿ� ó��
	
	//���ƴ� �̰� ���þ��� ����
	//�̷��� ���þ��°ű���...
	//���� ��� ���� �־���� ��?
	//ť�� �����̶� ������ �˰� �־�����, ��¿�� ����ϴ°��� �����µ�
	//�޸� : 18MB / �ð� : 0.184 s
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
						stack.push(ch);		// ��ȣ ������ �̻��ϰų�, �ݴ� ��ȣ�� ���� �����ų� �ϸ� break;
						break;
					}
					stack.pop();			// �װ� �ƴ϶�� ¦�� �¾Ƽ� pop
				}
			}
			
			sb.append(stack.isEmpty() ? "yes" : "no").append("\n");
		}
		
		System.out.println(sb);
	}
	
}
