package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3053 {

	//백준 문제 3053 : 택시 기하학
	//원의 넓이 : πr^2 , 원의 둘레 : 2πr ,  구의 겉넓이 : 4πr^2 , 구의 부피 : 4/3πr^3
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		System.out.printf("%.6f", r*r*Math.PI);
		System.out.println();
		System.out.printf("%.6f", (double)2*r*r);
		
		br.close();
	}

}
