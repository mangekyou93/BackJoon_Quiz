package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1157 {

	//���� ���� 1157 : �ܾ� ����
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		s = s.toUpperCase();
		
		int[] arr = new int[26];
		int max = 0;
		char answer = '?';
		
		for(int i=0 ; i<s.length() ; i++) {
			arr[s.charAt(i) - 'A']++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = (char)(i + 65);
			} else if(arr[i] != 0 && arr[i] == max) {
				answer = '?';
				//break;									���� ��Ʈ : aabbcccc -> 2, 2, 4�ε� ?�� ���� ::: C�� ���;� ��
			}
		}
		
		System.out.println(answer);
	}
}
