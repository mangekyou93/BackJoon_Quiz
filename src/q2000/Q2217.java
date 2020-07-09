package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2217 {

	//���� ���� 2217 : ����
	//�з� : �׸��� �˰���
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//�޸� : 23MB / �ð� : 0.224 s
		//��� �������ϴ�
		int max = 0;
		for(int i=arr.length-1 ; i>=0 ; i--) {
			arr[i] = arr[i] * (N-i);
			if(max < arr[i]) max = arr[i];
		}
		System.out.println(max);
		
		/*
		//�޸� : 23MB / �ð� : 0.244 s
		for(int i=0; i<arr.length ; i++) {
			arr[i] = arr[i] * (arr.length-i);
		}

		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		*/
	}
}
