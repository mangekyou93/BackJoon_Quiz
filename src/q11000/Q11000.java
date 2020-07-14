package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q11000 {

	//백준 문제 Q11000 : 강의실 배정
	//분류 : 그리디
	//메모리 : 75MB / 시간 : 0.648 s
	
	//우선순위 큐로 한번에 할 수 있음
	//우선순위 큐는 오름차순으로 나가니까 
    //강의가 끝나는 시간보다 더 작은 시작 시간이 있으면
    //강의실을 하나 추가 해야함
    //그렇게 poll과 offer을 반복하면 size가 강의실의 갯 수가 됨.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i=0 ; i<N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0 ; i<N ; i++) {
			if(!pq.isEmpty() && pq.peek() <= arr[i][0]) {
				pq.poll();
			}
			pq.offer(arr[i][1]);
		}
		System.out.println(pq.size());
	}
}
