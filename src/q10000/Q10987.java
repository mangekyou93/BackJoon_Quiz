package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10987 {

	//���� ���� 10987 : ������ ����
	//�з� : ���ڿ� ó��
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Character> arr = new ArrayList<Character>();
		arr.add('a');
		arr.add('e');
		arr.add('o');
		arr.add('u');
		arr.add('i');
		String s = br.readLine();
		
		int count = 0;
		for(int i=0 ; i<s.length() ; i++) {
			if(arr.contains(s.charAt(i))) count++;
		}
		
		System.out.println(count);
	}
	
}
