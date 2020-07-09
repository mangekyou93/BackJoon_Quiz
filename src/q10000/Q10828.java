package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Q10828 {

	//백준 문제 10828 : 스택
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			
			switch (s) {
				case "push" : 
					stack.push(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop" :
					if(stack.empty()) sb.append(-1).append("\n");
					else sb.append(stack.pop()).append("\n");
					break;

				case "size" :
					sb.append(stack.size()).append("\n");
					break;
					
				case "empty" :
					if(stack.empty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
					
				case "top" :
					if(stack.empty()) sb.append(-1).append("\n");
					else sb.append(stack.peek()).append("\n");	
					break;
			}
			
		}
		
		System.out.println(sb);
	}
	
	
}
