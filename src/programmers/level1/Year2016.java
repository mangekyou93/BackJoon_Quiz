package programmers.level1;

import java.util.Calendar;

public class Year2016 {

	//level 1
	//���α׷��ӽ� ���� : 2016��
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int a = 5;
		int b = 24;
		
		cal.set(2016, a-1, b);
		
		System.out.println(cal.getTime().toString().substring(0, 3).toUpperCase());
	}
	
	//�ٸ� ��� Ǯ��
	public String solution(int a, int b) {
		String answer = "";
		
		int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] MM = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int Adate = 0;
		
		for(int i=0 ; i<a-1 ; i++) {	//�� �ޱ����� ��.
			Adate += c[i];
		}
		Adate += b-1;
		answer = MM[Adate%7];
		
		return answer;
	}
}
