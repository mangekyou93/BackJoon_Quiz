package programmers.level1;

public class SumOfDigit {

	//level 1
	//���α׷��ӽ� ���� : �ڸ��� ���ϱ�
	public static void main(String[] args) {
		
		int N = 987;
		
		int answer = 0;
		while(N > 0) {
			answer += N % 10;
			N /= 10;
		}
		
		System.out.println(answer);
	}
	
}
