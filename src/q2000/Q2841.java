package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2841 {

	//���� ���� 2841 : �ܰ����� ��Ÿ ����
	//�з� : ����
	
	//�޸� : 134MB / �ð� : 0.892 s => ������ ��� ���� : �޸� 256MB / �ð� 1s
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
