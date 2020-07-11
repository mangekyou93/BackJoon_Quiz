package programmers.level1;

public class FindKim {

	//level 1
	//프로그래머스 문제 : 서울에서 김서방 찾기
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		
		int index = 0;
        for(int i=0 ; i<seoul.length ; i++){
            String str = seoul[i];
            if(str.equals("Kim")) {
                index = i;
                break;
            }
        }
        
        String answer = "김서방은 "+index+"에 있다";
        System.out.println(answer);
	}
}
