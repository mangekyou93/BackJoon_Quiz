package programmers.level1;

public class HarshadNumber {

	//level 1
	//���α׷��ӽ� ���� : �ϻ��� ��
	public static void main(String[] args) {
		
		int x = 12;
		int a = x;
		int sum = 0;
		while(a > 0) {
			sum += a%10;
			a /= 10;
		}
		
		System.out.println(x%sum == 0 ? true : false);
	}
	
}
