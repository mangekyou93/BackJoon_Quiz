package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3009 {

	
	//백준 문제 3009 : 네 번째 점
	//때로는 단순하게 생각하자...
	//이런 문제는 사실 거저주는거니까 시간을 오래쓰지말고 그냥 빠르게 풀고 넘어가야한다
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		String[] c = br.readLine().split(" ");
		
		String x = "";
		String y = "";
		
		if(a[0].equals(b[0])) {
			x = c[0];
		} else if(a[0].equals(c[0])) {
			x = b[0];
		} else {
			x = a[0];
		}
		
		if(a[1].equals(b[1])) {
			y = c[1];
		} else if(a[1].equals(c[1])) {
			y = b[1];
		} else {
			y = a[1];
		}
		
		System.out.println(x+" "+y);
	}

}
