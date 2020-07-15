package programmers.level1;

public class HidePhoneNumber {

	//level 1
	//���α׷��ӽ� ���� : �ڵ��� ��ȣ ������
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
		
		//subString���� �ص� �Ǵµ� ����...
		System.out.println(sb.reverse().toString());
	}
	
	//�ٸ� ��� Ǯ��(toCharArray)
	public String solution(String phone_number) {
	     char[] ch = phone_number.toCharArray();
	     for(int i = 0; i < ch.length - 4; i ++){
	         ch[i] = '*';
	     }
	     return String.valueOf(ch);
	}
	
	//�ٸ� ��� Ǯ��2 (���Խ�)
	public String solution2(String phone_number) {
	    return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
