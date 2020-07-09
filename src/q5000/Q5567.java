package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q5567 {

	//���� ���� 5567 : ��ȥ��
	//�з� : ����
	
	//bfs��..
	//����̿� ģ������ ���踦 ����� �׷����� ����
	//����̿� ģ������ ���踦 �׷����� ��Ÿ������ ��, ������(�����)���κ��� �ִܰŸ��� 2������ ������ ������ ���Ͻÿ�.
	static int[][] friends;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashSet<Integer> hs = new HashSet<Integer>();
		int N = Integer.parseInt(br.readLine());			// N : ������ ��	(2 <= n <= 500)
		int M = Integer.parseInt(br.readLine());			// M : ����Ʈ�� ����	(1 <= M <= 10000)
		
		friends = new int[M][2];
				
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			friends[i][0] = a;
			friends[i][1] = b;
			
			if(a == 1) {
				hs.add(b);
			}
		}
		
		Arrays.sort(friends, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]);
			}
		});
		int count = hs.size();
		
		for(int i=0 ; i<M ; i++) {
			if(hs.contains(friends[i][0]) && !hs.contains(friends[i][1])) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
