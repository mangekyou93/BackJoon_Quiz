package programmers.level1;

public class SubaksuBaksuBak {

	//level 1
	//프로그래머스 문제 : 수박수박수박수박수박수?
	public static void main(String[] args) {
		int n = 3;
		
		int q = n / 2;
		int r = n % 2;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<q ; i++) {
			sb.append("수박");
		}
		
		if(r == 1) sb.append("수");
		
		System.out.println(sb.toString());
	}
	
}
