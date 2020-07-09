package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4796 {

	//���� ���� 4796 : ķ�� 
	//�з� : �׸��� �˰���
	
	//��� �Է� ������ int�����̴�.
	//�� ���� ���� Ƚ���� ��û �� ���̴ϱ�, �ִ��� �ݺ����� ���ؾ� �Ѵ�.
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int index = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int L = 0;
			
			if((L = Integer.parseInt(st.nextToken())) == 0) break;
			
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			int count = (V/P)*L;
			V %= P;
			count += V > L ? L : V;
			
			sb.append("Case ").append(index).append(": ").append(count).append("\n");
			index++;
		}	
		
		System.out.println(sb);
	}
}
