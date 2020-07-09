package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q5430 {

	//���� ���� 5430 : AC
	//�޸� : 104MB / �ð� : 0.780 s
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
				//�迭�� ���µ� R������ ������ �ʿ䰡 ���ٰ� �����ؼ� �־��µ� �̰� �������ٴ�...
				//�����غ��� RRRRDR�̸� D�� �ִµ� error�� �ѷ�����ϴµ� ���ؼ� �׷��� ����.
				//�ƴϸ� �ٸ� �ݷʰ� �ִ°ǰ�..
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
