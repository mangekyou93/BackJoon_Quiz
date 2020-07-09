package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5597 {
	
	//���� ���� 5597 : ���� �� ���� ��..?
	//�з� : ����
	static int[] student = new int[31];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<28 ; i++) {
			student[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1 ; i<student.length ; i++) {
			if(student[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
