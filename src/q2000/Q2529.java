package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2529 {

	//백준 문제 2529 : 부등호
	//분류 : 그리디 알고리즘
	
	//어려운 문제임... 지금은 패스 (2020-06-15)
	static boolean[] su;
	static String[] sign;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		sign = br.readLine().split(" ");
		
		simbol(k);
		
		//1개는 아래에서부터 올라가면서 찾으면 제일 작은 수
		//1개는 위에서부터 내로오면서 찾으면 제일 큰 수
		//가 되지 않을까??
		
	}
	
	public static void simbol(int n) {
		su = new boolean[10];
		String s = "";
		for(int i=0 ; i<su.length ; i++) {
			for(int j=i+1 ; j<su.length ; j++) {
				for(int k=0 ; k<sign.length ; k++) {
					if(sign[k].equals("<")) {
						if(i < j) {
							su[i] = true;
							su[j] = true;
						}
					}else {
						if(i > j) {
							su[i] = true;
							su[j] = true;
						}
					}
				}
			}
		}
	}
	
}
