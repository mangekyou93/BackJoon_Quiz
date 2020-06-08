package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11651 {

	//���� ���� 11651 : ��ǥ �����ϱ� 2
	//�޸� : 59MB / �ð� : 0.576 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
			
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {							// y��ǥ�� ���� ���� ���
					return Integer.compare(o1[0], o2[0]);		// x��ǥ�� ���Ѵ�.
				}
				
				return Integer.compare(o1[1], o2[1]);			// y��ǥ�� ���� �ٸ� ���
			}
		});
		
		for(int i=0 ; i < n ; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}

}
