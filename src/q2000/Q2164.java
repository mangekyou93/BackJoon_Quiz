package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
	
	//���� ���� 2164 : ī��2
	//�޸� : 45MB / �ð� : 0.136 s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1 ; i<=N ; i++) {
			queue.offer(i);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			if(queue.size() == 1) break;
			queue.offer(queue.poll());
		}
		
		System.out.println(queue.poll());
	}
	
}
