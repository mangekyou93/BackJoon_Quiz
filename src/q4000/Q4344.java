package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4344 {

	//���� ���� 4344 : ����� �Ѱ���
	//�޸� : 15MB / �ð� : 0.108 s
	//String.format���� �Ҽ����� ��Ÿ�� �� �ְ�, printf�� ������ ����ϴ�.
	//Math.round = �ݿø� , Math.ceil = �ø� , Math.floor = ����(����)
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int index = 0;
			int[] arr = new int[st.countTokens()];
			int sum = 0;
			
			while(st.hasMoreElements()) {
				arr[index] = Integer.parseInt(st.nextToken());
				
				if(index > 0) {
					sum += arr[index];
				}
				index++;
			}
			
			double avg = sum / (index-1);
			int count = 0;
			for(int j=1 ; j<arr.length ; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}
			double rate = 100.0 * count / (arr.length-1);
			sb.append(String.format("%.3f", rate)+"%\n");
		}
		System.out.println(sb);
	}
}
