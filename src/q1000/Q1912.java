package q1000;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
	
	//���� ���� 1912 : ������
	//�з� : ���̳��� ���α׷���
	//�޸� : 24MB / �ð� : 0.184 s
	
	//ù ��°�� �ð� �ʰ��� ����
	//1 <= N <= 100,000
	//O(N^2)�̶� 1�ʸ� �Ѿ�� ��
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//���̳��� ���α׷����� ����...
		//��� �� �������� ����Ž������ �ϱ⿡�� O(N^2)�̶� �ð��� �����ϰ�,
		//���̳��� ���α׷������� Ǫ�� ���� O(N)�� ���ͼ� 1�� �̸����� ���´�.
		int[] dp = new int[n];
		dp[0] = arr[0];
		int max = arr[0];
		for(int i=1 ; i<n ; i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
		/*
		//���� �ҽ�(����)
		//�ð����⵵ ���� for�� == O(n^2)
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				if(i!=j) {
					result = Math.max(result, a[i]+a[j]);
				}
			}
		}
		
		System.out.println(result);
		
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		*/
	}
	

}
