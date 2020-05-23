package q10000;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	
	//���� ���� 10951 : A+B - 4
	//StringTokenizer�� Ư�� ��Ȳ�� �ƴϸ� ���ɸ鿡�� �ξ� ����ϴ�.
	//��� �ð��� BufferedWriter���� StringBuilder�� ���� �� ����
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
			//bw.write((a+b)+"\n");
		}
		System.out.println(sb);
		//bw.flush();
		//bw.close();
		br.close();
	}
}
