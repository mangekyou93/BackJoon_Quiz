package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10845 {

	//백준 문제 10845 : 큐
	//LinkedList로 큐를 구현할 수 있다.
	//메모리 : 18MB / 시간 : 0.140 s
	static StringBuilder sb = new StringBuilder();
	static LinkedList<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String s = st.nextToken();
			
			switch(s) {
				case "push" :
					push(Integer.parseInt(st.nextToken()));
				break;
				
				case "pop" :
					pop();
				break;
				
				case "size" :
					size();
				break;
				
				case "empty" :
					empty();
				break;
				
				case "front" :
					front();
				break;
				
				case "back" : 
					back();
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	public static void push(int n) {
		queue.offer(n);
	}
	
	public static void pop() {
		if(queue.isEmpty()) {
			sb.append(-1).append("\n");
			return ;
		}
		sb.append(queue.poll()).append("\n");
	}
	
	public static void size() {
		sb.append(queue.size()).append("\n");
	}
	
	public static void empty() {
		if(queue.isEmpty()) sb.append(1).append("\n");
		else sb.append(0).append("\n");
	}
	
	public static void front() {
		if(queue.isEmpty()) {
			sb.append(-1).append("\n");
			return ;
		}
		sb.append(queue.peek()).append("\n");
	}
	
	public static void back() {
		if(queue.isEmpty()) {
			sb.append(-1).append("\n");
			return ;
		}
		sb.append(queue.get(queue.size()-1)).append("\n");
	}
	
}
