package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814 {

	//���� ���� 10814 : ���̼� ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[][] s = new String[n][2];
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			s[i][0] = st.nextToken();
			s[i][1] = st.nextToken();
		}
		
		/*
		//���ͳ� �ڵ�
		//�޸� : 47MB / �ð� : 0.692 s
		//�ð��� 2�� ���� ������...
		Arrays.sort(s, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
		});
		
		for(int i=0 ; i<n ; i++) {
			sb.append(s[i][0]).append(" ").append(s[i][1]).append("\n");
		}
		*/
		
		
		//���� § �ڵ�
		//�޸� : 47MB / �ð� : 1.148 s
		//2�� for������ ���� �ð� ����...
		//���� Ž��
		//�̰� �Է� ���϶��� ����
		for(int i=1 ; i<=200 ; i++) {
			for(int j=0 ; j<n ; j++) {
				
				if(i == Integer.parseInt(s[j][0])) {
					sb.append(s[j][0]).append(" ").append(s[j][1]).append("\n");
				}
			}
		}
		
		
		System.out.println(sb);
	}

}
