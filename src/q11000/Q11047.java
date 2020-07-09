package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11047 {

	//���� ���� 11047 : ���� 0
	//(1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)
	//���� ������. ����� �ƴϸ� ���� ������ ������ ������ �޶���
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//������������ �Ǿ� �־ ��� �ʿ� ����
		Arrays.sort(arr);
		
		int count = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			if(K == 0) break;
			if(arr[i] > K) continue;
			
			count += K / arr[i];
			K %= arr[i];
			
		}
		
		System.out.println(count);
	}
	
}
