package programmers.level1;

public class TwoIntegerBetweenSum {

	//level 1
	//���α׷��ӽ� ���� : �� ���� ������ ��
	
	//��� �̰Ŵ� ���й���
	//���������� �� ���� ����ϸ� for�� ���� ���� �� ����
	//d(����) : 1, a1(����) : a,b�� ���� ��
	public static void main(String[] args) {
		
		int a = 5;
		int b = 3;
		
		long answer = 0;
        
        int temp = Math.min(a, b);
        b = Math.max(a,b);
        a = temp;
        
        for(int i=a ; i<=b ; i++){
            answer += i;
        }
        //return answer;
        
        //�ٸ� ��� Ǯ��
        sumAtoB(Math.min(a, b), Math.max(a, b));
	}
	
	//�ٸ� ��� Ǯ��
	public static long sumAtoB(int a, int b) {
		
		return (b - a + 1) * (a + b) / 2;			//���� ������ �� ����  n(a + l) / 2		//n : ����, a : ����, l : ������ ��
													//n{2a + (n-1)d} / 2			//n : ����, a : ����, d : ����
	}
}
