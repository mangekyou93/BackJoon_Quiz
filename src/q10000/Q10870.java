package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10870 {

	//���� ���� 10870 : �Ǻ���ġ �� 5
	//10872 ���丮�� ��Ÿ��
	//�̰͵� ��Ÿ��...
	public static void main(String[] args) throws Exception{
		
		//fn = fn-1 + fn-2 (��, n>=2)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
		
		br.close();
	}
	
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
