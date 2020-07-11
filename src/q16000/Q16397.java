package q16000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16397 {

	//백준 문제 16397 : 탈출
	//메모리 : 34MB / 시간 : 0.232 s
	
	//아마도 맨 앞자리 숫자 -1을 해주는 과정에서
	//문자열로 변경하고 charAt(0)으로 맨 앞자리 가져오고
	//그리고 다시 합치고, int로 변환 시켜주는 과정에서
	//시간이 오래 걸리는 것 같다.
	static int[] arr = new int[100000];
	static int T,G;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		
		bfs(N);
		
		System.out.println(arr[G] == 0 ? "ANG" : arr[G] - 1);
	}
	
	public static void bfs(int a) {
		Queue<Integer> q = new LinkedList<Integer>();
		arr[a]++;
		q.offer(a);
		
		while(!q.isEmpty() && T-- > 0) {
			int qSize = q.size();
			
			for(int i=0 ; i<qSize ; i++) {
				int x = q.poll();
				
				for(int j=0 ; j<2 ; j++) {
					int nx = x;
					if(j == 0) nx++;
					else {
						String s = String.valueOf(nx*2);
						if(Integer.parseInt(s) > 99999) continue;
						s = (s.charAt(0) - '1')+s.substring(1);
						nx = Integer.parseInt(s);
					}
					
					if(nx >= 0 && nx < 100000) {
						if(arr[nx] == 0) {
							arr[nx] = arr[x] + 1;
							q.offer(nx);
						}
					}
				}
			}
		}
		
	}
}
