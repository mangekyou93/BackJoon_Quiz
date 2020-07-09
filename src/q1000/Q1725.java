package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1725 {

	//백준 문제 1725 : 히스토그램
	//분류 : 스택
	
	//일단 보고 배꼈는데...
	//핵심은 현재의 히스토그램 높이가 스택의 peek보다 작은가? 이다.
	//이때마다 더 높이가 작아질때까지 pop을 하며 사각형의 넓이를 구해주는 것이다.
	//또한 for문을 < N이 아닌 <=N 까지인 이유는 스택에 남아있는 나머지 애들도 정리해주기 위해서다.
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
			
			//비어있으면 push를 한 번 해준다.
			while(!stack.empty() && histo[stack.peek()] > histo[i]) {
				int bot;
				top = stack.peek();
				stack.pop();
				if(stack.empty()) bot = i;				//비어 있으면 시작점까지의 거리라 보면 되니까 bot = i가 된다.
				else bot = i - stack.peek() - 1;		//이 부분이 핵심 : 현재 히스토그램의 위치(스택보다 작아진 순간)에서 스택의 peek는 pop된 놈의 바로 왼쪽이다.
														//즉 왼쪽과 현재 i 사이의 x축 거리를 구하는 과정
				
				max = Math.max(max, histo[top] * bot);
			}

			//stack에는 히스토그램의 인덱스 번호가 들어간다.
			stack.push(i);
		}
		
		System.out.println(max);
		
	}
	
	//분할 정복 : 시간 초과...
	//기준 정해서 양쪽으로 쭉 뻗어 나가게 했는데...
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
