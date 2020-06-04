package q7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {

	//���� ���� 7568 : ��ġ
	//������������!!!!!!!
	public static void main(String[] args) throws Exception{
		StringTokenizer st;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[0][i] = Integer.parseInt(st.nextToken()); 
			arr[1][i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0 ; i<N ; i++) {
			int j=0;
			int count = N;
			
			while(true) {
				if(i == j) {
					j++;
					continue;
				} else if(j == N) {
					sb.append(count).append(" ");
					break;
				}
				
				if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]) {		//��ġ�� ������ count�� ������ ����
					j++;
					continue;
				} else {													//��ġ�� ũ�ų� , ũ�ų� ������ ������ ������.(���� ������ ����)
					count--;
				}
				j++;
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
