package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2212 {

	//���� ���� 2212 : ����
	//�޸� : 17MB / �ð� : 0.136 s
	
	//�����ϱ� ��¥ ����� ����
	//���߱��� �����̶�� �����ϸ�
	//5���� ���߱��̸� 4���� �� ������ ����.		:: K-1���� �� ����
	//�� �Ÿ��� ���̸� ���ؼ�				:: distance �迭
	//ū �ͺ��� �� ������ŭ�� ������			:: len
	
	//�׸����� ���̸� len���� ���� �����ָ� �ּڰ��� ��.
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[N];
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int[] distance = new int[N-1];
		for(int i=0 ; i<distance.length ; i++) {
			distance[i] = Math.abs(arr[i+1] - arr[i]);
		}
		Arrays.sort(distance);
		
		int len = distance.length - (K-1);
		int sum = 0;
		for(int i=0 ; i<len ; i++) {
			sum += distance[i];
		}
		
		System.out.println(sum);
	}
}
