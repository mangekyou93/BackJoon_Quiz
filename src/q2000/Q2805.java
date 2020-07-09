package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805 {

	//백준 문제 2805 : 나무 자르기
	//분류 : 이분 탐색
	
	//이해가 안됨
	//if문에 같다로 else문 줘서 H를 찍어도 똑같이 이분 탐색인데 왜 시간초과가 나오는 건지 모르겠음
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] trees = new int[1000000];
		st = new StringTokenizer(br.readLine(), " ");
		
		long min = 0;
		long max = 0;
		for(int i=0 ; i<N ; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[i]);
		}
		
		
		while(min+1 < max) {
			long H = (min+max)/2;
			long sum = 0;
			
			for(int i=0 ; i<N ; i++) {
				if(trees[i] > H) sum += trees[i] - H;
			}
			
			if(sum >= M) min = H;
			else max = H;
		}
		
		System.out.println(min);
		
	}
	
	//시간 초과 : 이분 탐색을 사용해야함
	//시간 제한 : 1초, N 최대 1000000, M 최대 2000000000이라서
	/*
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] tree =new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		int min = 0;
		int max = 0;
		for(int i=0 ; i<N ; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		
		while(true) {
			int H = (max+min)/2;
			int sum = 0;
			
			for(int j=0 ; j<N ; j++) {
				if(tree[j]-H > 0) {
					sum += tree[j]-H;
				}
			}
			
			if(sum > M) {						//기준치(M) 보다 많이 가져가므로 H를 높여서 덜 가져가게 해야함
				min = H;
			} else if(sum < M) {				//기준치(M) 보다 덜 가져가므로 H를 낮추어서 더 가져가게 해야함
				max = H;
			} else {
				System.out.println(H);
				break;
			}
		}
	}
	*/
}
