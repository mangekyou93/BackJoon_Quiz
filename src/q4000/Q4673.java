package q4000;

import java.util.HashSet;

public class Q4673 {

	//���� ���� 4673 : ���� �ѹ�
	//�޸�  : 27MB / �ð� : 0.224 s
	public static void main(String[] args) throws Exception {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=1 ; i<=10000 ; i++) {
			hs.add(i + sequence(String.valueOf(i)));
		}
		
		selfNumber(hs);
	}
	
	static int sequence(String i) {
		String[] s = i.split("");
		int sum = 0;
		
		for(int j=0 ; j<s.length ; j++) {
			sum += Integer.parseInt(s[j]);
		}
		
		return sum;
	}
	
	static void selfNumber(HashSet<Integer> hs) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=1 ; i<=10000 ; i++) {
			if(!hs.contains(i)) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}
}
