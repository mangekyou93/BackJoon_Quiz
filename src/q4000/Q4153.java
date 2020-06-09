package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4153 {

	//백준 문제 4153 : 직각삼각형
	//분류 : 구현
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[3];
			
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			if(arr[0] == 0) {
				break;
			}
			
			Arrays.sort(arr);
			
			if(arr[0]*arr[0] + arr[1]*arr[1] == arr[2]*arr[2]) {
				sb.append("right\n");
			} else {
				sb.append("wrong\n");
			}
		}
		
		System.out.println(sb);
		br.close();

	}

}
