package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10610 {

	//���� ���� 10610 : 30
	//�з� : �׸��� �˰���
	
	//StringBuilder�� ����ؾ���
	//3�� ����� ��� �ڸ����� ���� 3�� ������� �Ѵ�.	:: ������
	static int[] su = new int[10];
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();			//N�� �ִ� 10^5���� ���� = �ִ� 10^5 �ڸ���
		
		System.out.println(getThirty(s));
		
	}
	
	public static String getThirty(String s) {
		if(!s.contains("0")) return "-1";			//0�� �ϳ��� ������ 30�� ����� �� �� ����.
		int sum = 0;
		
		for(int i=0 ; i<s.length() ; i++) {
			int a = s.charAt(i) - '0';
			su[a]++;
			sum += a;
		}
		if(sum % 3 != 0) return "-1";				//3�� ����� �� �ڸ����� ���� 3�� ���������.
		
		sb = new StringBuilder();					//�� �� �����ϸ� StringBuilder�� append������.
		for(int i=su.length-1 ; i>=0 ; i--) {
			while(su[i] > 0) {
				sb.append(i);
				su[i]--;
			}
		}
		return sb.toString();
	}
}
