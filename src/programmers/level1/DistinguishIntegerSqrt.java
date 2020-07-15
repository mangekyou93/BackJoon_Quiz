package programmers.level1;

public class DistinguishIntegerSqrt {

	//level 1
	//���α׷��ӽ� ���� : ���� ������ �Ǻ�
	
	//���Ϸ� ������ �� ��������...
	//�׳� �װ� ��Ʈ ����� �����ؼ� ������ �´°ǵ��Ф�
	public static void main(String[] args) {
		long n = 64;
		long answer = -1;
		
		for(long i=1 ; i<=Math.sqrt(n) ; i++) {
			if(i*i == n) {
				answer = (long)Math.pow(i+1, 2);
			}
		}
		
		System.out.println(answer);
	}
	
	
	//�ٸ� ��� Ǯ��
	public long solution(long n) {
		if(Math.pow(Math.sqrt(n)+1, 2) == n) {
			return (long)Math.pow(Math.sqrt(n)+1, 2);
		}
		
		return -1;
	}
	
}
