package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10830 {

	//���� ���� 10830 : ��� ����
	//�޸� : 13MB / �ð� : 0.080 s
	
	//����� ���������� ���µ�
	//80 ms�� �����ٴ�...
	//���� ������ ���ΰ�
	//���� ���� ���� ��ͳ�, �ݺ����� ����ؼ� ������ ������ ��� ���ؿ��� ��.
	//Ȧ������ ���� �� �� �� �����ְ�, ¦������ ���� ������ ������ �������ָ� ��.
	static long[][] matrix;
	static int N = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		matrix = new long[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<N ; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		long[][] result = square(B);
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				sb.append(result[i][j]%1000).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static long[][] square(long n) {
		long[][] cal = new long[N][N];
		long[][] temp = new long[N][N];
		
		if(n == 1) {
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					cal[i][j] = matrix[i][j] % 1000;
				}
			}
		} else if(n % 2 == 0) {//¦��
			temp = square(n/2);
			
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					int sum = 0;
					for(int k=0 ; k<N ; k++) {
						sum += temp[i][k] * temp[k][j];
					}
					cal[i][j] = sum % 1000;
				}
			}
			
		} else {//Ȧ��
			temp = square(n-1);
			
			for(int i=0 ; i<N ; i++) {
				for(int j=0 ; j<N ; j++) {
					int sum = 0;
					for(int k=0 ; k<N ; k++) {
						sum += temp[i][k] * matrix[k][j];
					}
					cal[i][j] = sum % 1000;
				}
			}
		}
		
		return cal;
	}
}
