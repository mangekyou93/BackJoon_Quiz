package programmers.level1;

public class CaesarCode {

	//level 1
	//프로그래머스 문제 : 시저 암호
	//백준에서 문자열 문제 풀 때 카이사르 문제랑 유사함
	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if(ch == ' ') sb.append(" ");
			else if(ch >= 65 && ch <= 90) {		//대문자
				int temp = (int)(ch + n);
				if(temp > 90) temp -= 26;
				sb.append((char)temp);
			} else {							//소문자
				int temp = (int)(ch + n);
				if(temp > 122) temp -= 26;
				sb.append((char)temp);
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
