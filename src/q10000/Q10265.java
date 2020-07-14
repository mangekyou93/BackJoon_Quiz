package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10265 {

	//���� ���� 10265 : MT
	
	//DP�� �͵� �˰���. ���� : ������ ���� k�� ���ų� �۾ƾߵǰ�, ���� k == ����Ŭ or ������Ʈ ���̸� �װ� ����ϸ� �Ǵϱ�.
	//
	static int[] human;
	static int cycle;
	static boolean[] visited;
	static boolean[] finished;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());		//��� ��
		int k = Integer.parseInt(st.nextToken());		//������ �¿� �� �ִ� ��� ��
		human = new int[n+1];
		visited = new boolean[n+1];
		finished = new boolean[n+1];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1 ; i<human.length ; i++) {
			human[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		for(int i=1 ; i<human.length ; i++) {
			if(!visited[i]) {
				cycle = 0;
				dfs(i);
			}
			if(cycle == k) {
				sum = cycle;
			} else if(sum + cycle <= k) {
				sum += cycle;
			}
		}
		
		System.out.println(sum);
	}
	
	
	public static void dfs(int curr) {
		visited[curr] = true;
		int next = human[curr];
		if(visited[next]) {
			if(!finished[next]) {
				for(int i=next ; i!=curr ; i=human[i]) {
					cycle++;
				}
				cycle++;
			}
		}else {
			dfs(next);
		}
		finished[curr] = true;
	}
}
