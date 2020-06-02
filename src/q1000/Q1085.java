package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {

	//백준 문제 1085 : 직사각형에서 탈출
	//쉬운 문제임에도 2번 틀림...
	//끝까지 확인하고 제출하자!
	//삼항식을 자주 사용하는 것이 좋은걸까?
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int a = w - x < x - 0 ? w - x : x - 0;
		int b = h - y < y - 0 ? h - y : y - 0;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		if(b>a) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}

}
