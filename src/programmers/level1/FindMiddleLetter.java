package programmers.level1;

public class FindMiddleLetter {

	//level 1
	//���α׷��ӽ� ���� : ��� ���� ��������
	public static void main(String[] args) {
		
		String s = "qwerty";
		String answer = "";
		
		if(s.length() % 2 == 0) {		// ¦��
			answer = String.valueOf(s.charAt(s.length()/2 - 1)) + String.valueOf(s.charAt(s.length()/2));
		} else {						// Ȧ��
			answer = String.valueOf(s.charAt(s.length()/2));
		}
		
		System.out.println(answer);
	}
	
	
	//�ٸ� ��� Ǯ��
	//�� �ٷ� © ���� �ֱ���..
	//�� Ȧ�� ¦���� �и� ���ص� �̷��� Ǯ ������
	//�Դٰ� subString�����ϸ� String�� �����ϴϱ� �� ����..
	public String getMiddle(String word){

        return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
    }
}
