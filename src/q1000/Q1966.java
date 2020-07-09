package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966 {
	
	//���� ���� 1966 : ������ ť
	//�޸� : 14MB / �ð� : 0.096 s
	//�ð��� �������� ���� �Ȱɷ��� ���
	//ť�� ��� ������ �ʰ� clear()�ؼ� ����� �͵� ���ѵ�
	static int[] doc;
	static int[] prior;
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N == 1) {
				br.readLine();
				sb.append(1).append("\n");
				continue;
			}
			
			prior = new int[10];
			doc = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0 ; i<N ; i++) {
				int a = Integer.parseInt(st.nextToken());
				prior[a]++;
				doc[i] = a;
				queue.offer(i);
			}
			
			sb.append(print(M)).append("\n");
			queue.clear();
		}
		
		System.out.println(sb);
	}
	
	public static int print(int M) {
		int count = 0;
		
		for(int i=9 ; i>0 ; i--) {
			if(prior[i] == 0) continue;
			
			while(prior[i] > 0) {
				if(doc[queue.peek()] == i) {
					if(queue.peek() == M) return ++count;
					queue.poll();
					prior[i]--;
					count++;
					continue;
				}
				queue.offer(queue.poll());
			}
		}
		
		return count;
	}
	
}
