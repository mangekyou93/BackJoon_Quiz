package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10988 {

	//���� ���� 10988 : �Ӹ�������� Ȯ���ϱ�
	//�з� : ���ڿ� ó��
	public static void main(String[] args) throws Exception{
		
		//�Ӹ���� : level , noon �� �Ųٷ� �о ���� �� �Ӹ�����̶�� �Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		System.out.println(palindrome(s));
	}
	
	public static String palindrome(String s) {
		if(s.length() == 1) return "1";
		
		int a = 1;
		for(int i=0 ; i<s.length()/2 ; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				a--;
				break;
			}
		}
		
		return String.valueOf(a);
	}
	
	
	
	/*
	static String s;
	
	public static void main(String[] args) throws Exception{
		
		//�Ӹ���� : level , noon �� �Ųٷ� �о ���� �� �Ӹ�����̶�� �Ѵ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		s = br.readLine();
		
		sb.append(s.length() % 2 == 0 ? evenLen() : oddLen());
		System.out.println(sb);
	}
	
	public static String evenLen() {
		int a = 1;
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				a--;
				break;
			}
		}
		return String.valueOf(a);
	}
	
	public static String oddLen() {
		if(s.length() == 1) return "1";

		int a = 1;
		for(int i=0 ; i<s.length() ; i++) {
			if(i == s.length()/2) {
				break;
			}
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				a--;
				break;
			}
		}
		return String.valueOf(a);
	}
	
	*/
}
