package programmers.level1;

public class SubaksuBaksuBak {

	//level 1
	//���α׷��ӽ� ���� : ���ڼ��ڼ��ڼ��ڼ��ڼ�?
	public static void main(String[] args) {
		int n = 3;
		
		int q = n / 2;
		int r = n % 2;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<q ; i++) {
			sb.append("����");
		}
		
		if(r == 1) sb.append("��");
		
		System.out.println(sb.toString());
	}
	
}
