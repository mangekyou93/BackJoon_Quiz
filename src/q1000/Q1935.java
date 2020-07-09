package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1935 {

	//���� ���� 1935 : ���� ǥ���2
	//�з� : ����
	
	//����� �ǿ����ڸ� push���ְ�, �����ڸ� ���� ������ pop���༭ ���
	//���� ǥ����� ���ϴ� ���� �����ڸ� push�ؼ� ���� �����ڸ� ���� ������ pop
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Double> stack = new Stack<Double>();
		
		int N = Integer.parseInt(br.readLine());
		double[] value = new double[N];
		String s = br.readLine();
		
		for(int i=0 ; i<N ; i++) {
			value[i] = Double.parseDouble(br.readLine());
		}
		
		double sum = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if(ch - 'A' >= 0 && ch - 'A' <= 26) stack.push(value[ch - 'A']);
			else {
				double a = stack.pop();
				double b = stack.pop();
				
				switch(ch) {
					case '+' :
						stack.push(b + a);
						break;
						
					case '-' :
						stack.push(b - a);
						break;
						
					case '*' :
						stack.push(b * a);
						break;
						
					default :
						stack.push(b / a);
						break;
				}
			}
		}
		
		System.out.printf("%.2f", stack.pop());
	}
}
