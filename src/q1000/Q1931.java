package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {
	
	//���� ���� 1931 : ȸ�ǽǹ���
	
	//�׸��� �˰��� ����
	//�� �ð��� ���� �ͺ��� count�� �ָ� ��.
	//�޸� : 44MB / �ð� : 0.46 s
	static int[][] time;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		time = new int[n][2];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) return Integer.compare(o1[0], o2[0]);
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		
		int end = -1;
		int count = 0;
		
		for(int i=0 ; i<n ; i++) {
			
			if(time[i][0] >= end) {
				end = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}