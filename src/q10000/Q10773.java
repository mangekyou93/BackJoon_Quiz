package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {

	//���� ���� 10773 : ����
	
	//������ �������� ���� ���α׷��� �ϱⰡ ���ϴ�.
	//�迭�� �ð��� �� �� ������.
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		
		
		int K = Integer.parseInt(br.readLine());
		
		//�迭 ���
		//�޸� : 23MB / �ð� : 0.172 s
		//useArr(K);
		
		//���� ���
		//�޸� : 23MB / �ð� : 0.212 s
		useStack(K);
		
	}
	
	
	public static void useArr(int K) throws Exception {
		int[] arr = new int[100000];
		int count = 0;
		while(K-- > 0) {
			int a = Integer.parseInt(br.readLine());
			
			if(a != 0) {
				arr[count] = a;
				count++;
			}else {
				arr[--count] = 0;
			}
		}
		
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
	
	public static void useStack(int K) throws Exception {
		Stack<Integer> stack = new Stack<Integer>();
		
		while(K-- > 0) {
			int a = Integer.parseInt(br.readLine());
			
			if(a != 0) {
				stack.push(a);
			} else {
				stack.pop();
			}
		}
		
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}
}
