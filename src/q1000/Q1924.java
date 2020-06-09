package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Q1924 {

	//���� ���� 1924 : 2007��
	//�з� : ����
	//�迭���ؼ� �ϴ°� �� ���� ���̾�..
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�޸� : 13MB / �ð� : 0.072 s
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int month = Integer.parseInt(st.nextToken()) - 1;
		int date = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		for(int i=0 ; i<month ; i++) {
			sum += arr[i];
		}
		
		sum += date;
		
		switch (sum%7) {
			case 1: 
				System.out.println("MON");
				break;
			case 2: 
				System.out.println("TUE");
				break;
			case 3: 
				System.out.println("WED");
				break;
			case 4: 
				System.out.println("THU");
				break;
			case 5: 
				System.out.println("FRI");
				break;
			case 6: 
				System.out.println("SAT");
				break;
			default: 
				System.out.println("SUN");
				break;
		}
		
		/*
		//�޸� : 15MB / �ð� : 0.104 s
		Calendar cal = Calendar.getInstance();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		cal.set(2007, Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken()));
		
		
		System.out.println(cal.getTime().toString().substring(0, 3).toUpperCase());
		*/
	}
}
