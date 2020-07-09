package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805 {

	//���� ���� 2805 : ���� �ڸ���
	//�з� : �̺� Ž��
	
	//���ذ� �ȵ�
	//if���� ���ٷ� else�� �༭ H�� �� �Ȱ��� �̺� Ž���ε� �� �ð��ʰ��� ������ ���� �𸣰���
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] trees = new int[1000000];
		st = new StringTokenizer(br.readLine(), " ");
		
		long min = 0;
		long max = 0;
		for(int i=0 ; i<N ; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[i]);
		}
		
		
		while(min+1 < max) {
			long H = (min+max)/2;
			long sum = 0;
			
			for(int i=0 ; i<N ; i++) {
				if(trees[i] > H) sum += trees[i] - H;
			}
			
			if(sum >= M) min = H;
			else max = H;
		}
		
		System.out.println(min);
		
	}
	
	//�ð� �ʰ� : �̺� Ž���� ����ؾ���
	//�ð� ���� : 1��, N �ִ� 1000000, M �ִ� 2000000000�̶�
	/*
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] tree =new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		int min = 0;
		int max = 0;
		for(int i=0 ; i<N ; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		
		while(true) {
			int H = (max+min)/2;
			int sum = 0;
			
			for(int j=0 ; j<N ; j++) {
				if(tree[j]-H > 0) {
					sum += tree[j]-H;
				}
			}
			
			if(sum > M) {						//����ġ(M) ���� ���� �������Ƿ� H�� ������ �� �������� �ؾ���
				min = H;
			} else if(sum < M) {				//����ġ(M) ���� �� �������Ƿ� H�� ���߾ �� �������� �ؾ���
				max = H;
			} else {
				System.out.println(H);
				break;
			}
		}
	}
	*/
}
