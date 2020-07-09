package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1725 {

	//���� ���� 1725 : ������׷�
	//�з� : ����
	
	//�ϴ� ���� �貼�µ�...
	//�ٽ��� ������ ������׷� ���̰� ������ peek���� ������? �̴�.
	//�̶����� �� ���̰� �۾��������� pop�� �ϸ� �簢���� ���̸� �����ִ� ���̴�.
	//���� for���� < N�� �ƴ� <=N ������ ������ ���ÿ� �����ִ� ������ �ֵ鵵 �������ֱ� ���ؼ���.
	static int[] histo = new int[100001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		int top, n;
		
		for(int i=0 ; i<N ; i++) {
			histo[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0 ; i<=N ; i++) {
			
			//��������� push�� �� �� ���ش�.
			while(!stack.empty() && histo[stack.peek()] > histo[i]) {
				int bot;
				top = stack.peek();
				stack.pop();
				if(stack.empty()) bot = i;				//��� ������ ������������ �Ÿ��� ���� �Ǵϱ� bot = i�� �ȴ�.
				else bot = i - stack.peek() - 1;		//�� �κ��� �ٽ� : ���� ������׷��� ��ġ(���ú��� �۾��� ����)���� ������ peek�� pop�� ���� �ٷ� �����̴�.
														//�� ���ʰ� ���� i ������ x�� �Ÿ��� ���ϴ� ����
				
				max = Math.max(max, histo[top] * bot);
			}

			//stack���� ������׷��� �ε��� ��ȣ�� ����.
			stack.push(i);
		}
		
		System.out.println(max);
		
	}
	
	//���� ���� : �ð� �ʰ�...
	//���� ���ؼ� �������� �� ���� ������ �ߴµ�...
	/*
	static int[] arr;
	static int count = 1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int value = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			low(i, 1);
			high(i, 1);
			
			int sum = arr[i] * count;
			if(value < sum) {
				value = sum;
			}
			
			count = 1;
		}
		
		System.out.println(value);
	}
	
	public static void low(int a, int i) {
		if(a-i < 0) return ;
		
		if(arr[a-i] >= arr[a]) {
			count++;
			i++;
			low(a, i);
		} else {
			return ;
		}
	}
	
	public static void high(int a, int i) {
		if(a+i >= arr.length) return ;
		
		if(arr[a+i] >= arr[a]) {
			count++;
			i++;
			high(a, i);
		} else {
			return ;
		}
	}
	*/
}
