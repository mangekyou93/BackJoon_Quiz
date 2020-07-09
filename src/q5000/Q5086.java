package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {
	
	//���� ���� 5086 : ����� ���
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a > b) {
				sb.append(a%b == 0 ? "multiple" : "neither").append("\n");
			} else {
				sb.append(b%a == 0 ? "factor" : "neither").append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
}
