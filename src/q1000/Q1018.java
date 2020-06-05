package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {

	//���� ���� 1018 : ü���� �ٽ� ĥ�ϱ�
	//���Ʈ���� ����
	static boolean[][] arr;
	static int min = 64;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N][M];
		
		
		for(int i=0 ; i<N ; i++) {
			String s = br.readLine();
			
			for(int j=0; j<M ; j++) {
				if(s.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		for(int i=0 ; i<N-7 ; i++) {
			for(int j=0 ; j<M-7 ; j++) {
				find(i,j);
			}
		}
		
		System.out.println(min);

	}
	
	
	public static void find(int x, int y) {
		int end_x = 8+x;
		int end_y = 8+y;
		int count = 0;
		
		boolean tf = arr[x][y];
		
		for(int i=x ; i < end_x ; i++) {
			for(int j=y ; j < end_y ; j++) {
				
				if(arr[i][j] != tf) {
					count++;
				}
				
				tf = (!tf);
			}
			//���� �ٷ� �Ѿ�� ���� �����
			tf = (!tf);
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}

}
