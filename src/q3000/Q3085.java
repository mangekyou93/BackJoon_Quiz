package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3085 {

	//���� ���� 3085 : ���� ����
	//�з� : ���Ʈ ����
	
	//�Ĳ��� �ڵ� �ؾߵȴ�.
	//���Ʈ ���� ��, ���� Ž���� �׳� �밡�ٷ� �϶�� ����Ŵϱ�
	//������ �����ϰ� �ڵ��߳��� �� �� �ϴ�.
	static char[][] candy;
	static int N,row = 0, col = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		candy = new char[N][N];
		
		for(int i=0 ; i<N ; i++) {
			candy[i] = br.readLine().toCharArray();
		}
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				if(j+1 < N) {
					char t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j+1] = t;
					
					findCandy();
					
					t = candy[i][j];
					candy[i][j] = candy[i][j+1];
					candy[i][j+1] = t;
				}
				
				if(i+1 < N) {
					char t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
					
					findCandy();
					
					t = candy[i][j];
					candy[i][j] = candy[i+1][j];
					candy[i+1][j] = t;
				}
			}
		}
		System.out.println(row >= col ? row : col);
		
		
		/*
		//�� �ҽ�
		for(int i=0 ; i<N ; i++) {
			int a = 0;
			for(int j=0 ; j<N ; j++) {
				if(a == j) continue;
				char temp = candy[i][j];
				candy[i][j] = candy[i][a];
				candy[i][a] = temp;
				
				findCandy();
				
				temp = candy[i][j];
				candy[i][j] = candy[i][a];
				candy[i][a] = temp;
				
				a++;
			}
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			int a = i+1;
			for(int j=0 ; j<N ; j++) {
				char temp = candy[i][j];
				candy[i][j] = candy[a][j];
				candy[a][j] = temp;
				
				findCandy();
				
				temp = candy[i][j];
				candy[i][j] = candy[a][j];
				candy[a][j] = temp;
			}
		}
		
		System.out.println(row > col ? row : col);
		*/
	}
	
	public static void findCandy() {
		
		for(int i=0 ; i<N ; i++) {
			int cnt = 1;
			for(int j=1 ; j<N ; j++) {
				if(candy[i][j] == candy[i][j-1]) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if(row < cnt) row = cnt;
			}
			
			cnt = 1;
			for(int j=1 ; j<N ; j++) {
				if(candy[j][i] == candy[j-1][i]) {
					cnt++;
				} else {
					cnt = 1;
				}
				
				if(col < cnt) col = cnt;
			}
		}
		
		
		
		/*
		//�� �ҽ�
		int rowCount = 0;
		int colCount = 0;
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<N ; j++) {
				rowCount = 0;
				colCount = 0;
				char c = candy[i][j];
				
				//����
				for(int k=0 ; k<N ; k++) {
					if(c == candy[i][k]) {
						rowCount++;
					} else {
						break;
					}
				}
				
				//����
				for(int k=0 ; k<N ; k++) {
					if(c == candy[k][i]) {
						colCount++;
					} else {
						break;
					}
				}
				
				if(row < rowCount) {
					row = rowCount;
				}
				if(col < colCount) {
					col = colCount;
				}
			}
		}
		*/
	}
}
