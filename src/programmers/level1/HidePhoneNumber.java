package programmers.level1;

public class HidePhoneNumber {

	//level 1
	//프로그래머스 문제 : 핸드폰 번호 가리기
	public static void main(String[] args) {
		
		String phone_number = "027778888";
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for(int i=phone_number.length()-1 ; i>=0 ; i--) {
			if(count < 4) {
				sb.append(phone_number.charAt(i));
				count++;
			} else {
				sb.append("*");
			}
		}
		
		//subString으로 해도 되는데 굳이...
		System.out.println(sb.reverse().toString());
	}
	
	//다른 사람 풀이(toCharArray)
	public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	}
	
	//다른 사람 풀이2 (정규식)
	public String solution2(String phone_number) {
	    return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
