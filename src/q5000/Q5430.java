package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q5430 {

	//백준 문제 5430 : AC
	//메모리 : 104MB / 시간 : 0.780 s
	static Deque<Integer> deque = new LinkedList<Integer>();
	static String s;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			s = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String ar = br.readLine();
			
			ar = ar.substring(1,ar.length()-1);
			st = new StringTokenizer(ar, ",");
			while(st.hasMoreTokens()) {
				deque.offer(Integer.parseInt(st.nextToken()));
			}
			
			AC();
			sb.append("\n");
			deque.clear();
		}
		
		System.out.println(sb);
		br.close();
	}
	
	public static void AC() {
		boolean R = false;
		
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if(ch == 'D') {
				if(deque.isEmpty()) {
					sb.append("error");
					return ;
				}
				if(R) {
					deque.pollLast();
				} else {
					deque.pollFirst();
				}
			} else {
				/*
				//배열이 없는데 R연산을 수행할 필요가 없다고 생각해서 넣었는데 이게 문제였다니...
				//생각해보니 RRRRDR이면 D가 있는데 error를 뿌려줘야하는데 못해서 그런거 같다.
				//아니면 다른 반례가 있는건가..
				if(deque.isEmpty()) {
					break ;
				}
				*/
				if(R) R = !R;
				else R = !R;
			}
		}
		
		sb.append("[");
		while(!deque.isEmpty()) {
			if(deque.size() == 1) {
				sb.append(deque.poll());
				break;
			}
			if(R) sb.append(deque.pollLast()).append(",");
			else sb.append(deque.pollFirst()).append(",");
		}
		sb.append("]");
		
	}
}
