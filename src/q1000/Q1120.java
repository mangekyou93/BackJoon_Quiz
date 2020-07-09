package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1120 {

	//���� ���� : ���ڿ�
	//�з� : ���ڿ� ó��
	
	//���� �ʹ� �ָ���
	//���� A�� ���̰� B�� ���̿� ������ �� ���� ������ ���� ������ �� �� �ִ�.
	//A�� �տ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
	//A�� �ڿ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
	//�̶�, A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҷ� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	//�� �� ����
	//A = aaa , B = bbaaabb �� �� 
	//1. aaa, bba
	//2. aaa, baa
	//3. aaa, aaa
	//....
	//�̷������� ���϶�� ���̿���..
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int count = 0;
		int min = Integer.MAX_VALUE;
		if(A.length() == B.length()) {
			for(int i=0 ; i<A.length() ; i++) {
				if(A.charAt(i) != B.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			for(int i=0 ; i<=B.length()-A.length() ; i++) {
				String b = B.substring(i, A.length()+i);
				count = 0;
				for(int j=0 ; j<A.length() ; j++) {
					if(A.charAt(j) != b.charAt(j)) {
						count++;
					}
				}
				if(count < min) min = count;
			}
			System.out.println(min);
		}
	}
	
}
