package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10797 {

	//���� ���� 10797 : 10����
	//�з� : ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		
		while(st.hasMoreTokens()) {
			if(n == Integer.parseInt(st.nextToken())) count++;
		}
		
		System.out.println(count);
	}
}
