package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10830 {

	//백준 문제 10830 : 행렬 제곱
	//메모리 : 13MB / 시간 : 0.080 s
	
	//놀랍다 삼중포문을 썻는데
	//80 ms가 나오다니...
	//분할 정복의 힘인가
	//제곱 같은 경우는 재귀나, 반복문을 사용해서 반으로 나눠서 계속 곱해오면 됨.
	//홀수같은 경우는 한 번 더 곱해주고, 짝수같은 경우는 반으로 나눠서 제곱해주면 됨.
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
		} else if(n % 2 == 0) {//짝수
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
			
		} else {//홀수
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
