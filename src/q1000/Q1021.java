package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1021 {


	//���� ���� 1021 : ȸ���ϴ� ť
	//�з� : �ùķ��̼�, ���� ����Ʈ
	
	//ť�� �׻� ���� ����Ʈ(Linked List)�� ���� ����ϸ� ����.
	//�̰� �� ť�� ���ϰ�, Linked List����
	//���ؾ��� ���ڰ� ������ ���� ù ����� ���̷� ���ϸ鼭
	//�����ص� ������.
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> tempQ = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[M];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<M ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1 ; i<=N ; i++) {
			queue.offer(i);
		}
		
		
		int count = 0;
		for(int i=0 ; i<arr.length ; i++) {
			if(queue.peek() == arr[i]) {
				queue.poll();
			} else {
				while(queue.peek() != arr[i]) {
					tempQ.offer(queue.poll());
				}
				
				if(queue.size()-1 >= tempQ.size()) {			//�� -> ��
					count += tempQ.size();
				}else {										//�� -> ��
					count += queue.size();
				}
				queue.poll();
			}
			while(!tempQ.isEmpty()) {
				queue.offer(tempQ.poll());
			}
		}
		
		System.out.println(count);
	}
	
}
