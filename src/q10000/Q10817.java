package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10817 {

	//백준 문제 10817 : 세 수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[3];
		int i=0;
		
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		br.close();
	}
}
