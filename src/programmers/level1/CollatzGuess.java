package programmers.level1;

public class CollatzGuess {

	//level 1
	//���α׷��ӽ� ���� : �ݶ��� ����
	public static void main(String[] args) {
		
		int n = 626331;
		long a = n;
		int answer = 0;
		while(a > 1) {
			if(answer > 500) {
				answer = -1;
				break;
			}
			
			if(a % 2 == 0) {
				a /= 2;
			} else {
				a = a * 3 + 1;
			}
			answer++;
		}
		
		System.out.println(answer);
	}
	
}
