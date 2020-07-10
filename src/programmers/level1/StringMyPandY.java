package programmers.level1;

public class StringMyPandY {

	//level 1
	//���α׷��ӽ� ���� : ���ڿ� �� p�� y�� ����
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
	
	
	//���� �ڵ�
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
	
	//�ٸ� ��� Ǯ��
	boolean solution2(String s) {
        s = s.toUpperCase();

        //���ٽ��� Ȱ���Ѱ� ����..
        //����� 2�ٸ��� © �� �ִٴ�..
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
