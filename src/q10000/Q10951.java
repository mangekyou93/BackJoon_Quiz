package q10000;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	
	//백준 문제 10951 : A+B - 4
	//StringTokenizer가 특정 상황이 아니면 성능면에서 훨씬 우월하다.
	//출력 시간은 BufferedWriter보다 StringBuilder가 조금 더 빠름
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
