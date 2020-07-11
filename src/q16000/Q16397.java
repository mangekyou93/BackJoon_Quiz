package q16000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16397 {

	//���� ���� 16397 : Ż��
	//�޸� : 34MB / �ð� : 0.232 s
	
	//�Ƹ��� �� ���ڸ� ���� -1�� ���ִ� ��������
	//���ڿ��� �����ϰ� charAt(0)���� �� ���ڸ� ��������
	//�׸��� �ٽ� ��ġ��, int�� ��ȯ �����ִ� ��������
	//�ð��� ���� �ɸ��� �� ����.
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
