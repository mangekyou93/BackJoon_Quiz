package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2630 {

	//���� ���� 2630 : ������ �����
	
	//���� ����
	//�����̸� ��� �ݾ� �߶�
	//�� �ȿ� ����ִ°� ���� �Ķ���, ���� �Ͼ���̳� ���� ����
	//������ ��Ȯ�� ����� �� ������ ���� ���� ������� �ν��ؾ���.(�� ����� �ƴϴ���, �ּ������� �ɰ� �� �ִٸ�)
	//���Ҵܰ�, �����ܰ谡 ����
	//N=1���� ���������� �����ܰ踦 ����
	//�� ������ �� �ִٸ� ���Ҵܰ踦 ����
	static boolean[][] paper;
	static int white = 0, blue = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		paper = new boolean[N][N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; st.hasMoreTokens() ; j++) {
				if(st.nextToken().equals("1")) {
					paper[i][j] = true;					//true == ��� == 1
					continue;
				} 
			}
		}
		
		getColor(N, 0, 0);
		System.out.println(white);
		System.out.println(blue);
	}
	
	static void getColor(int n, int x, int y) {
		if(isSame(n,x,y)) {								//���� �ܰ�
			if(!paper[y][x])white++;
			else blue++;
			return;
		}

		getColor(n/2, x, y);							//���� �ܰ�
		getColor(n/2, x+n/2, y);
		getColor(n/2, x, y+n/2);
		getColor(n/2, x+n/2, y+n/2);
	}
	
	static boolean isSame(int n, int x, int y) {
		boolean criteria = paper[y][x];
		for(int i=y ; i<y+n ; i++) {
			for(int j=x ; j<x+n ; j++) {
				if(criteria != paper[i][j]) return false;
			}
		}
		return true;
	}
}
