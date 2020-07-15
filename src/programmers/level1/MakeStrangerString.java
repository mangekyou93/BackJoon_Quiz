package programmers.level1;


public class MakeStrangerString {

	//level 1
	//���α׷��ӽ� ���� : �̻��� ���� �����
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
	
	//�ٸ� ��� Ǯ��
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
