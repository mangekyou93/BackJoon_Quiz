package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {
	
	//백준 문제 11866 : 요세푸스 문제 0
	//메모리 23MB / 시간 : 0.128 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Queue<Integer> queue = new LinkedList<Integer>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1 ; i<=N ; i++) {
			queue.offer(i);
		}
		
		sb.append("<");
		while(queue.size() > 1) {
			int count = 1;
			while(count < K) {
				queue.offer(queue.poll());
				count++;
			}
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll()).append(">");
		
		System.out.println(sb);
	}
	
}
