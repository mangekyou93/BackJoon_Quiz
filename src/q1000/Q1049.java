package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1049 {

	//���� ���� 1049 : ��Ÿ��
	//�з� : �׸��� �˰���
	
	//�׸���� ������ ��¥ ���� �غ��°� �߿��Ѱ� ����.
	//�׳��ϴٰ� ���� �������� �������� ���� 1�������� Ʋ��.
	//�ϴ� �ּ�(���� 0) �ִ� ������ �� �غ��� �ɷ�...	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[M][2];
		
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
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
		
		int min = 1001;
		for(int i=0 ; i<M ; i++) {
			if(min > arr[i][1]) {
				min = arr[i][1];
			}
		}
		
		int pay = 0;
		while(N > 0) {
			if(min == 0) break;
			
			if(N <= 6) {
				pay += arr[0][0] <= min*N ? arr[0][0] : min*N;
				N = 0;
			} else {
				pay += arr[0][0] < min*6 ? arr[0][0] : min*6;
				N -= 6;
			}
		}
		
		System.out.println(pay);
		
	}
}
