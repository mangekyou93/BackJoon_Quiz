package programmers.level1;


public class MakeStrangerString {

	//level 1
	//프로그래머스 문제 : 이상한 문자 만들기
	public static void main(String[] args) {
		
		String s = "ASF  AWa  sfwaaSF";
	    StringBuilder sb = new StringBuilder(s);
	    
	    int index = 0;
	    for(int i=0 ; i<sb.length() ; i++) {
	    	if(sb.charAt(i) == ' ') continue;
	    	index = i;
	    	for(int j=i ; sb.charAt(i) != ' ' && j<sb.length() ; j++) {
	    		if((j - index) % 2 == 0) {
	    			sb.setCharAt(j, Character.toUpperCase(sb.charAt(j)));
	    		} else {
	    			sb.setCharAt(j, Character.toLowerCase(sb.charAt(j)));
	    		}
	    		i = j;
	    	}
	    }
	    
	    System.out.println(sb.toString());
	}
	
	//다른 사람 풀이
	public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
        
        return answer;
    }
}
