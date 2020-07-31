package programmers.level2;

public class NumberOf124 {

	//level 2
	//프로그래머스 문제 : 124 나라의 숫자
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		int n = 3;
		
		int re = 0;
		while(n > 0) {
			re = n%3;
			if(re == 0) sb.insert(0, 4);
			else sb.insert(0, re);
			
			n = (n - 1) / 3;
		}
		
		System.out.println(sb);
	}
	
	
}
