package q8000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q8979 {

	//���� ���� 8979 : �ø���
	//�з� : ����
	static int[][] nation;
	static int count = 1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());		//���� �� ��
		int K = Integer.parseInt(st.nextToken());		//K��° ����
		nation = new int[N][5];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			nation[i][0] = Integer.parseInt(st.nextToken());
			nation[i][1] = Integer.parseInt(st.nextToken());
			nation[i][2] = Integer.parseInt(st.nextToken());
			nation[i][3] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nation, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					if(o1[2] == o2[2]) {
						return Integer.compare(o2[3], o1[3]);//���޴�
					}else {
						return Integer.compare(o2[2], o1[2]);//���޴�
					}
				}else {
					return Integer.compare(o2[1], o1[1]);//�ݸ޴�
				}
			}
		});
		
		System.out.println(Arrays.toString(nation[0]));
		System.out.println(Arrays.toString(nation[1]));
		System.out.println(Arrays.toString(nation[2]));
		System.out.println(Arrays.toString(nation[3]));
		System.out.println(Arrays.toString(nation[4]));
		System.out.println(Arrays.toString(nation[5]));
		System.out.println(Arrays.toString(nation[6]));
		
		for(int i=0 ; i<N ; i++) {
			
		}
	}
}
