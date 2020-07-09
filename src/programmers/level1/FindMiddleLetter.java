package programmers.level1;

public class FindMiddleLetter {

	//level 1
	//프로그래머스 문제 : 가운데 글자 가져오기
	public static void main(String[] args) {
		
		String s = "qwerty";
		String answer = "";
		
		if(s.length() % 2 == 0) {		// 짝수
			answer = String.valueOf(s.charAt(s.length()/2 - 1)) + String.valueOf(s.charAt(s.length()/2));
		} else {						// 홀수
			answer = String.valueOf(s.charAt(s.length()/2));
		}
		
		System.out.println(answer);
	}
	
	
	//다른 사람 풀이
	//한 줄로 짤 수도 있구나..
	//꼭 홀수 짝수를 분리 안해도 이렇게 풀 수있음
	//게다가 subString으로하면 String을 리턴하니까 더 좋음..
	public String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
}
