package q11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11401 {

	//���� ���� 11401 : ���� ��� 3
	//�Ľ�Į�� ������ �ð� �ʰ�
	//���ʿ� dp�δ� �޸𸮰� ������. dp[4000000][4000000] => 4�鸸 * 4�鸸
	//���� ����� 1000000007�� ���� ������
	//1 <= N <= 4000000 , 0 <= K <= N
	//�ϴ� ���װ���� ���丮�� �Ǵ� �Ľ�Į�� �ﰢ��(DP)�� ���� �� �ִ�.
	
	//�丣���� �������� �̿��ؾ��ϴ� ����.. ��ƴ�
	//a^p-1 % p = 1		: p�� �Ҽ� 
	
	//Ȯ�� ��Ŭ���� ȣ�����̳� �丣���� �������� �̿��ϴ� �����ε�
	//��¥ ���ذ� �Ȱ���...
	//������ �� ���İ��..
	static long d = 1000000007;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
	}
	
}
