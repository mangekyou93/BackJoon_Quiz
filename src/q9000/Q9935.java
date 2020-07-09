package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9935 {

	//���� ���� 9935 : ���ڿ� ����
	//�з� : ���ڿ� ó��
	
	//�޸� �ʰ��� ���� substring ��� �Ұ�
	//���� �˻�(1543)�̶��� �� �ٸ� ����
	
	//���� ���
	//�޸� : 90MB / �ð� : 0.54 s
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		
		String s = br.readLine();
		String bomb = br.readLine();
		
		for(int i=0 ; i<s.length() ; i++) {
			boolean isBomb = false;
			char ch = s.charAt(i);
			st.push(ch);
			
			if(st.size() >= bomb.length()) {
				isBomb = true;
				for(int j=0 ; j<bomb.length() ; j++) {
					char a = bomb.charAt(j);
					char b = st.get(st.size()-bomb.length()+j);
					if(a != b) {
						isBomb = false;
						break;
					}
				}
				if(isBomb) {
					for(int j=0 ; j<bomb.length() ; j++) {
						st.pop();
					}
				}
			}
		}
		
		if(st.isEmpty()) System.out.println("FRULA");
		else {
			for(int i=0 ; i<st.size() ; i++) {
				sb.append(st.get(i));
			}
			System.out.println(sb);
		}
		st.clear();
		
		/*
		//�޸� �ʰ�
		while(s.contains(bomb)) {
			
			int i = s.indexOf(bomb);
			
			if(i == 0) {
				s = s.substring(bomb.length());
			} else {
				String a = s.substring(0, i);
				String b = s.substring(i+bomb.length(), s.length());
				s = a + b;
			}
		}
		
		System.out.println(s.equals("") ? "FRULA" : s);
		*/
	}
	
}
