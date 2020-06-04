package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q2798 {

	//���� ���� 2798 : ����
	//���Ʈ������ ù��° ����
	//���Ʈ : ������,������ / ���� : �� 			:: ���״�� ������������ �����ϴ� ��
	//3�������� ����ص� ������.
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int min = Integer.MAX_VALUE;
		int answer = 0;
		
		String[] text = br.readLine().split(" ");
		int[] arr = new int[text.length];
		
		for(int i=0 ; i<text.length ; i++) {
			arr[i] = Integer.parseInt(text[i]);
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				for(int k=j+1 ; k<arr.length ; k++) {
					hs.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		
		for(Integer i : hs) {
			if(M - i >= 0 && M - i < min) {
				min = M - i;
				answer = i;
			}
		}
		System.out.println(answer);
		br.close();
	}

}
