package programmers.level1;

public class StringMyPandY {

	//level 1
	//프로그래머스 문제 : 문자열 내 p와 y의 개수
	public static void main(String[] args) {
		
		String s = "pPoooyY";
		s = s.toLowerCase();
		
		int[] arr = new int[26];
		
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			System.out.println(ch - 'a');
			arr[ch - 'a']++;
		}
		
		System.out.println(arr[15] == arr[24] ? true : false);
	}
	
	
	//예전 코드
	boolean solution(String s) {
        boolean answer = false;
        
        s = s.toLowerCase();
		
		int pCount = 0;
		int yCount = 0;
		for(int i=0 ; i<s.length() ; i++){
			
			if(s.charAt(i) == 'p'){
				pCount++;
			}
			else if(s.charAt(i) == 'y'){
				yCount++;
			}
		}
		
		if(pCount == yCount){
			answer = true;
		}
        
        return answer;
    }
	
	//다른 사람 풀이
	boolean solution2(String s) {
        s = s.toUpperCase();

        //람다식을 활용한거 같음..
        //대단함 2줄만에 짤 수 있다니..
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
