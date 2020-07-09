package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {

	//백준 문제 10866 : 덱
	//메모리 : 18MB / 시간 : 0.144 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<Integer>();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
				case "push_front" : 
					deque.offerFirst(Integer.parseInt(st.nextToken()));
				break;
				
				case "push_back" : 
					deque.offerLast(Integer.parseInt(st.nextToken()));
				break;
				
				case "pop_front" : 
					if(deque.isEmpty()) sb.append("-1\n");
					else sb.append(deque.pollFirst()).append("\n");
				break;
				
				case "pop_back" : 
					if(deque.isEmpty()) sb.append("-1\n");
					else sb.append(deque.pollLast()).append("\n");
				break;
				
				case "size" :
					sb.append(deque.size()).append("\n");
				break;
				
				case "empty" :
					if(deque.isEmpty()) sb.append("1\n");
					else sb.append("0\n");
				break;
				
				case "front" :
					if(deque.isEmpty()) sb.append("-1\n");
					else sb.append(deque.peekFirst()).append("\n");
				break;
				
				case "back" :
					if(deque.isEmpty()) sb.append("-1\n");
					else sb.append(deque.peekLast()).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
	
}
