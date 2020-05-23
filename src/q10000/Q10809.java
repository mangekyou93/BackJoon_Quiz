package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10809 {

	//���� ���� 10809 : ���ĺ� ã��
	//�޸� : 13MB / �ð� : 0.072 s
	//�ƽ�Ű �ڵ� a~z = 97 ~ 122
	//�ߺ��� ��(ex. bacdcaaa , aaaaa)�� ó���ϴ� ������ �� ����...
	//�ߺ��� ���� ó������ �ʾƵ� ���ǿ��� ������� ����� ����...
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		
		int[] arr = new int[26];
		int a = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			a = s.charAt(i) - 'a';
			if(arr[a] == 0) {
				arr[a] = i+1;
			}
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			sb.append(arr[i]-1+" ");
		}
		
		System.out.println(sb);
	}
}
