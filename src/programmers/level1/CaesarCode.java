package programmers.level1;

public class CaesarCode {

	//level 1
	//���α׷��ӽ� ���� : ���� ��ȣ
	//���ؿ��� ���ڿ� ���� Ǯ �� ī�̻縣 ������ ������
	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<s.length() ; i++) {
			char ch = s.charAt(i);
			
			if(ch == ' ') sb.append(" ");
			else if(ch >= 65 && ch <= 90) {		//�빮��
				int temp = (int)(ch + n);
				if(temp > 90) temp -= 26;
				sb.append((char)temp);
			} else {							//�ҹ���
				int temp = (int)(ch + n);
				if(temp > 122) temp -= 26;
				sb.append((char)temp);
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
