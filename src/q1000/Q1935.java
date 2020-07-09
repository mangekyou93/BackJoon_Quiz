package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1935 {

	//백준 문제 1935 : 후위 표기식2
	//분류 : 스택
	
	//계산은 피연산자를 push해주고, 연산자를 만날 때마다 pop해줘서 계산
	//후위 표기식을 구하는 것은 연산자를 push해서 상위 연산자를 만날 때마다 pop
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
