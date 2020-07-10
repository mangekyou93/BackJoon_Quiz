package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Q2981 {

	//���� ���� 2981 : �˹�
	//�޸� : 14MB / �ð� : 0.092 s
	//v[i] = m * temp[i] + r
	//v[i] - v[i-1] = m *(temp[i] - temp[i-1]) + (r-r)		:: �������� ���Ƽ� �������� �������ش�.
	
	//��¥ ��ƴ�..
	//�̰� ���� ��� �ִ������� ������ ������ �� ���� ����...
	//��¥ ����ϴ٤�
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> hs = new HashSet<Integer>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);									//�������� ���� ���� ���ְ�
		
		int gcd = arr[1] - arr[0];							//34 - 6	= 28
		for(int i=2 ; i<arr.length ; i++) {					//38 - 34	= 4
			gcd = GCD(gcd, arr[i] - arr[i-1]);				//4�� 28�� �ִ����� 4	4���� 1�� ������ ��� 2 4�� ����
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2 ; i<=Math.sqrt(gcd) ; i++) {			//����� ���� �� 1~n���� ������ ����
															//��Ʈ�� ������ָ� O(n) -> O(log n)���� �پ�� �� �ִ�.
			if(gcd % i == 0) {
				al.add(i);									//i = 3�̸�
				al.add(gcd/i);								//3���� ���� �� ����� �Ǵϱ�
			}
		}
		al.add(gcd);										//1�� �� �ڱ� �ڽű��� ���
		Collections.sort(al);
		ArrayList<Integer> distinct = new ArrayList<Integer>();
		
		for(int i : al) {
			if(!distinct.contains(i)) distinct.add(i);		//�ߺ� ����
		}
		
		for(int i : distinct) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
	
	public static int GCD(int a, int b) {
		
		if(b == 0) {
			return a;
		} else {
			return GCD(b, a%b);
		}
	}
}
