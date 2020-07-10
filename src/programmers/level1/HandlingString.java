package programmers.level1;

public class HandlingString {

	//level 1
	//프록래머스 문제 : 문자열 다루기 기본
	public static void main(String[] arg) {
		
		String s = "123456";
		boolean answer = true;

		if(s.length() == 4 || s.length() == 6) {
			for(int i=0 ; i<s.length() ; i++) {
				char ch = s.charAt(i);
				
				if(ch - '9' > 0) {
					answer = false;
					break;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}
	
	//다른 사람 풀이
	public boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			try {																	//예외처리로 잡을 줄이야...
				int a = Integer.parseInt(s);
				return true;
			}catch(NumberFormatException e) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean solution2(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");		//정규식 사용 : 알아두면 진짜 편함.
        return false;
  }
}
