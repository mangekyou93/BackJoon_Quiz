package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9625 {

	//���� ����  9625 : BABBA
	//�з� : �ݺ���
	//�غ��ϱ� �Ǻ���ġ ������
	//�̰� ��ͷ� Ǯ ���ΰ� �׳� �ݺ������� Ǯ ���ΰ�
	//�� �� Ǯ���
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		//�ݺ���
		repeat(k);
		
		//���
		//Ʋ�ȴٰ� ����
		//int a = recursion(k-1);
		//int b = recursion(k);
		//System.out.println(a+" "+b);
	}
	
	
	public static int recursion(int k) {
		if(k == 0) return 0;
		if(k == 1) return 1;
		
		return recursion(k-1)+recursion(k-2);
	}
	
	//�ݺ���
	public static void repeat(int k) {
		if(k == 1) {
			sb.append("0 1");
			return ;
		}
		
		int[] arr = new int[45];
		arr[0] = 1;
		arr[1] = 1;
		
		//for(int i=2 ; i<=k ; i++) {		//  i <= k ���� �ϸ� ��Ÿ�� ����....
		for(int i=2 ; i<k ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		sb.append(arr[k-2]+" "+arr[k-1]);
	}

}
