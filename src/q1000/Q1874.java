package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {

	//���� ���� 1874 : ���� ����
	//�޸� : 34MB / �ð� : 2.612 s		��ǻ� ���� 2�� �̸����� ���;���
	
	//������ ������� �ʰ� �迭�� �̿��Ѵٸ� �� ���� �޸𸮿� �ð��� ����� �� �ִ�.
	//append, push, contains, �� ���� �Լ��� ����� ���
	//��ǻ�Ͱ� ����(ó��)�� �� ���� �ؾߵż� �ð��� ���� �ɸ�������...
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		while(n-- > 0) {
			int a = Integer.parseInt(br.readLine());
			
			if(!stack.contains(a)) {
				while(count <= a) {
					stack.push(count);
					sb.append("+").append("\n");
					count++;
				}
				stack.pop();
				sb.append("-").append("\n");
			} else {
				if(a < stack.peek()) {
					System.out.println("NO");			//0.05�� ������
					return;
				} else if(a == stack.peek()) {
					stack.pop();
					sb.append("-").append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}
