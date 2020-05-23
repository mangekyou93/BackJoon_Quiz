package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2577 {

	//���� ���� 2577 : ������ ����
	//���� �ɸ��� �˾Ҵµ� for���� 1�ܰ辿�̶� O(N)��
	//�׸��� �迭�� 2���� ����ؼ� �޸𸮴� �迭 ���� ���Ҷ����� ���� ��
	
	//�ƽ�Ű�ڵ� 30~39 == 0~9 �̹Ƿ� charAt���� �߾ ������...
	//���ڿ�,�ڸ���,�ƽ�Ű�ڵ�(char) �ٷ�� ���� ���� �����ϴ�..
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 1;
		
		for(int i=0 ; i<3 ; i++) {
			int temp = Integer.parseInt(br.readLine());
			total = total * temp;
		}
		
		String[] word = String.valueOf(total).split("");
		int[] arr = new int[10];
		
		for(int i=0 ; i<word.length ; i++) {
			arr[Integer.parseInt(word[i])]++;
		}
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
