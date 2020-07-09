package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874 {

	//백준 문제 1874 : 스택 수열
	//메모리 : 34MB / 시간 : 2.612 s		사실상 실패 2초 미만으로 나와야함
	
	//스택을 사용하지 않고 배열을 이용한다면 더 적은 메모리와 시간을 사용할 수 있다.
	//append, push, contains, 등 많은 함수를 사용할 경우
	//컴퓨터가 연산(처리)을 더 많이 해야돼서 시간이 오래 걸리나보다...
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
					System.out.println("NO");			//0.05초 빨라짐
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
