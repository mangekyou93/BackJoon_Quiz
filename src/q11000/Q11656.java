package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11656 {

	//���� ���� 11656 : ���̻� �迭
	//�з� : ���ڿ� ó��
	
	//�޸� : 19MB / �ð� : 0.1s
	//�������� �ð��� ���̳���
	//�Ƹ��� Arrays.sort�� �� �����ε� �־��� ��찡 �� �� �ֳ���
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		String[] arr = new String[s.length()];
		
		for(int i=0 ; i<s.length() ; i++) {
			arr[i] = s.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
