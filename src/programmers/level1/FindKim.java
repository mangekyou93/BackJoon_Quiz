package programmers.level1;

public class FindKim {

	//level 1
	//���α׷��ӽ� ���� : ���￡�� �輭�� ã��
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
        
        String answer = "�輭���� "+index+"�� �ִ�";
        System.out.println(answer);
	}
}
