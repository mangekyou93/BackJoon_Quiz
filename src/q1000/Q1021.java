package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1021 {


	//백준 문제 1021 : 회전하는 큐
	//분류 : 시뮬레이션, 연결 리스트
	
	//큐는 항상 연결 리스트(Linked List)와 같이 사용하면 좋다.
	//이거 꼭 큐로 안하고, Linked List에서
	//비교해야할 숫자가 마지막 노드와 첫 노드의 차이로 비교하면서
	//진행해도 괜찮음.
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
				
				if(queue.size()-1 >= tempQ.size()) {			//앞 -> 뒤
					count += tempQ.size();
				}else {										//뒤 -> 앞
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
