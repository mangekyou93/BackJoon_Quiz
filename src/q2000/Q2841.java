package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2841 {

	//백준 문제 2841 : 외계인의 기타 연주
	//분류 : 스택
	
	//메모리 : 134MB / 시간 : 0.892 s => 간신히 통과 제한 : 메모리 256MB / 시간 1s
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Stack<Integer>> arr = new ArrayList<Stack<Integer>>();
		Stack<Integer> stack;
		for(int i=0 ; i<6 ; i++) {
			stack = new Stack<Integer>();
			arr.add(stack);
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int count = 0;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(arr.get(a-1).empty() || arr.get(a-1).peek() < b) {
				arr.get(a-1).push(b);
				count++;
			} else if(arr.get(a-1).peek() > b) {
				
				while(arr.get(a-1).peek() > b) {
					arr.get(a-1).pop();
					count++;
					
					if(arr.get(a-1).empty()) break;
				}
				
				if(arr.get(a-1).empty() || arr.get(a-1).peek() < b) {
					arr.get(a-1).push(b);
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
}
