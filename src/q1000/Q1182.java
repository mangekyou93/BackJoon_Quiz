package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1182 {

	//���� ���� 1182 : �κм����� ��
	
	//�̰� ������ ���� �Ȱ��� �ٽ��غ��� ������..
	static int N, S;
	static int[] arr;
	static int count = 0;
	static int currSum = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(count);
	}
	
	public static void dfs(int curr) {
		if(curr == N) return ;
		
		// ��������� ���� S�� ī��Ʈ + 1
		if(currSum + arr[curr] == S) count++;
		
		// �̹� ���Ҹ� ���Խ�Ű�� �ʰ� �õ�
		dfs(curr + 1);
		
		// �̹� ���Ҹ� ���Խ�Ű�� �õ�
		currSum += arr[curr];
		dfs(curr + 1);
		
		//�������� �ٽ� �̹� ���Ҹ� ����� ��
		currSum -= arr[curr];
	}
}
