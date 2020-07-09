package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1697 {

	//���� ���� 1697 : ���ٲ���
	//�޸� : 19MB / �ð� : 0.128 s
	//�ʹ� �Ʊ��� ������...
	//���� �� BFS�� ������ Ǯ �� �־����ٵ�
	//�丶�乮������ z����� ���� ������ �� ��
	//������ ������ �� +1, -1�� �ƴ϶� *2�� �� ���� �ִ�.
	//���� ������ ���� �� �������� �ʴٴ� �͵� �˾Ƶξ�� �Ѵ�.
	static int N, K;
	static int[] position;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		position = new int[100001];
		
		Arrays.fill(position, -1);
		
		bfs();
		
		System.out.println(position[K]);
	}
	
	public static void bfs() {
		int next = N;
		int[] status = new int[3];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(N);
		position[N] = 0;
		
		while(!q.isEmpty()) {
			if(next == K) break;
			
			next = q.poll();
			status[0] = next - 1;		// �ڷ� �� ĭ
			status[1] = next + 1;		// ������ �� ĭ
			status[2] = next * 2;		// �����̵�
			
			for(int i=0 ; i<3 ; i++) {
				
				if(status[i] >= 0 && status[i] <= 100000) {
					
					//�湮���� �ʾҴٸ�
					if(position[status[i]] == -1) {
						position[status[i]] = position[next] + 1;
						q.offer(status[i]);
					}
				}
			}
			
		}
	}
}
