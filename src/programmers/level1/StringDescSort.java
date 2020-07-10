package programmers.level1;

import java.util.Arrays;

public class StringDescSort {

	//level 1
	//���α׷��ӽ� ���� : ���ڿ� ������������ ��ġ�ϱ�
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = "idfjsdfjLIDJSFJSFAEJFHsdfjlkdsjflse";
		int[] arr = new int[58];
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			arr[ch - 'A']++;
		}
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			if(arr[i] !=0) {
				while(arr[i] > 0) {
					sb.append((char)(i + 'A'));
					arr[i]--;
				}
			}
		}
		
		System.out.println(sb);
	}
	
	//�ٸ� ��� Ǯ��
	public static String reverseStr(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		
		return new StringBuilder(new String(sol)).reverse().toString();
	}
}
