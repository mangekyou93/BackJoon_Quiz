package programmers.level1;

public class IntegerSortDesc {

	//level 1
	//���α׷��ӽ� ���� : ���� �������� ��ġ�ϱ�
	public static void main(String[] args) {
		long n = 34025834;
		int[] arr = new int[10];
		
		while(n > 0) {
			arr[(int)(n%10)]++;
			n /= 10;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=9 ; i>=0 ; i--) {
			if(arr[i] == 0) continue;
			
			while(arr[i] > 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		
		System.out.println(Long.parseLong(sb.toString()));
	}
	
}
