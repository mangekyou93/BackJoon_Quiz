package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818 {

	//���� ���� 10818 : �ּ�, �ִ�
	//2���� �迭 ����, �迭 �����
	//�迭�� �����ϰԵǸ� n�� ������ 1,000,000(�鸸)�̶� �޸� �� ���� �ð��� �ʹ� �ҿ��ų ������ ����
	//��ġ�� �ҽ��� �ݹ� © �� ���� Arrays.sort();�� ���Ͽ�
	public static void main(String[] args) {
		
		//�迭 ���			�޸� : 118MB , �ð� : 1��
		//arrUse();
		
		//�迭 �̻��			�޸� : 110MB , �ð� : 0.48��
		//noArrUse();
	}
	
	static void arrUse() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int i = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				arr[i] = Integer.parseInt(st.nextToken());
				i++;
			}
			
			Arrays.sort(arr);
			
			System.out.println(arr[0]+" "+arr[arr.length-1]);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void noArrUse() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int max = -1000001;
			int min = 1000001;
			
			while(st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				
				if(value < min) {
					min = value;
				}
				
				if(value > max) {
					max = value;
				}
			}
			
			sb.append(min+" "+max);
			System.out.println(sb);
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
