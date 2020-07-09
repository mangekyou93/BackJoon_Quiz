package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10610 {

	//백준 문제 10610 : 30
	//분류 : 그리디 알고리즘
	
	//StringBuilder를 사용해야함
	//3의 배수는 모든 자릿수의 합이 3의 배수여야 한다.	:: 정수론
	static int[] su = new int[10];
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();			//N은 최대 10^5개의 숫자 = 최대 10^5 자릿수
		
		System.out.println(getThirty(s));
		
	}
	
	public static String getThirty(String s) {
		if(!s.contains("0")) return "-1";			//0이 하나라도 없으면 30의 배수가 될 수 없다.
		int sum = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			int a = s.charAt(i) - '0';
			su[a]++;
			sum += a;
		}
		if(sum % 3 != 0) return "-1";				//3의 배수는 각 자릿수의 합이 3의 배수여야함.
		
		sb = new StringBuilder();					//둘 다 만족하면 StringBuilder로 append해주자.
		for(int i=su.length-1 ; i>=0 ; i--) {
			while(su[i] > 0) {
				sb.append(i);
				su[i]--;
			}
		}
		return sb.toString();
	}
}
