package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2783 {

	//백준 문제 2783 : 삼각 김밥
	//분류 : 반복문
	//최소값 구하는 문제
	//근데 말이 너무 거창함..
	//이런거에 익숙해져야함 문제 똑바로 읽고 집중하자
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double value = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double a = Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken());
			
			if(a < value) {
				value = a;
			}
		}
		
		System.out.printf("%.2f", value*1000);
	}

}
