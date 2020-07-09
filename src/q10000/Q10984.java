package q10000;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Q10984 {

	//백준 문제 10984 : 내 학점을 구해줘
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			double gpa = 0.0;
			
			for(int i=0 ; i<n ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int c = Integer.parseInt(st.nextToken());			//학점(1,2,3, ... )
				double g = Double.parseDouble(st.nextToken());		//받은 점수(0, 0.7, 1, 1.3, 1.7, 2, 2.3, 2.7, 3, 3.3, 3.7, 4, 4.3)
				
				sum += c;
				gpa += c*g;											//gpa = 모든 과목의 (학점 * 점수) 합 / 총점
			}
			
			sb.append(sum).append(" ").append(Math.round(gpa/sum*10)/10.0).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
}
