package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q9466 {

	//���� ���� 9466 : �� ������Ʈ
	//���� �о�ϱ� �ܹ���׷����̰�, ����Ŭ ã�� ����
	
	//stack�� ����ϴ� �ð� �ʰ� ����...
	//contains�� pop�� ��� ���༭ �׷�����
	//�޸� : 286MB / �ð� : 1.004 s
	//�ð��� �Ƹ��� n <= 10�������� ���� ������ ����
	//�޸𸮴� student��, visited, finished�� ��� ������༭ �׷��� ����.
	static int[] student;
	static boolean[] visited;
	static boolean[] finished;
	static int cnt, n;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			student = new int[n+1];
			visited = new boolean[n+1];
			finished = new boolean[n+1];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=1 ; i<=n ; i++) {
				student[i] = Integer.parseInt(st.nextToken());
			}
			
			cnt = 0;
			for(int i=1 ; i<=n ; i++) {
				dfs(i);
			}
			
			sb.append(n - cnt).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int n) {
		visited[n] = true;
		int next = student[n];
		
		if(visited[next]) {
			if(!finished[next]) {
				for(int i=next ; i!=n ; i=student[i]) cnt++;
				cnt++;		//�ڱ� �ڽ�
			}
		}
		else dfs(next);
		finished[n] = true;
	}
}
