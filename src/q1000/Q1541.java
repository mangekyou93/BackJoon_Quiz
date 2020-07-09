package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541 {

	//���� ���� 1541 : �Ҿ���� ��ȣ
	//���� �̰͵� �Ǳ�� ��.
	//�������ؼ� �׷���
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		String s = st.nextToken();
		int sum = 0;
		if(s.contains("+")) {
			StringTokenizer str = new StringTokenizer(s, "+");
			while(str.hasMoreTokens()) {
				sum += Integer.parseInt(str.nextToken());
			}
		}else {
			sum += Integer.parseInt(s);
		}
		
		while(st.hasMoreTokens()) {
			s = st.nextToken();
			if(s.contains("+")) {
				StringTokenizer str = new StringTokenizer(s, "+");
				while(str.hasMoreTokens()) {
					sum -= Integer.parseInt(str.nextToken());
				}
			}else {
				sum -= Integer.parseInt(s);
			}
		}
		
		System.out.println(sum);
	}
	
}
