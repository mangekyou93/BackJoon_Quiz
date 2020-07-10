package programmers.level1;

public class HandlingString {

	//level 1
	//���Ϸ��ӽ� ���� : ���ڿ� �ٷ�� �⺻
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
	
	//�ٸ� ��� Ǯ��
	public boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			try {																	//����ó���� ���� ���̾�...
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
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");		//���Խ� ��� : �˾Ƶθ� ��¥ ����.
        return false;
  }
}
