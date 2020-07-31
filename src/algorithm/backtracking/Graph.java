package algorithm.backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Graph {

	//��Ʈ��ŷ : ���� Ž���� �� ����, ������ ��� ������ �� �õ��ϴ� ��
	//���� ���� 15649 : N�� M (1)�� �⺻ ����� ��Ʈ��ŷ�� �������� ������ �˷���
	//��� N�� M ������ C++�̶�� STL�� next_permutation�̶�� �Լ��� �����Ͽ�, next_permutation���ε� ������ �����ϴٰ� �Ѵ�.
	//JAVA���� next_permutation���� �Լ��� ���� ������ �Լ��� �����غ��� �͵� ���� �� ����.
	
	//2020-07-30�� Ǯ���� ���ĺ�(DFS ���)������ true�� ��͸� ���鼭 ��Ͱ� ���� �� false�� �������ָ鼭 ���� ������ �����߾��µ�,
	//��� ȣ���� �Ƹ��ٿ��� ��������.
	static int N, M;
	static int[] arr = new int[10];
	static boolean[] used = new boolean[10];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		startBacktracking(0);
		
	}
	
	public static void startBacktracking(int k) {
		if(k == M) {
			for(int i=0 ; i<M ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return ;
		}
		
		for(int i=1 ; i<=N ; i++) {
			if(!used[i]) {
				arr[k] = i;
				used[i] = true;
				startBacktracking(k+1);				//��͸� ���ؼ� 
				used[i] = false;
			}
		}
	}
}
