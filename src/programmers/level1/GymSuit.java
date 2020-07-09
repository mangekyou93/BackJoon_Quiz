package programmers.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class GymSuit {

	//level 1
	//���α׷��ӽ� ���� : ü����
	
	//���� ����� ������ ��û �����ɸ�...
	//�������� �� �����ؼ� �ؾ���
	//�׸��� ������ ������ �о����
	//���α׷��ӽ� ���� Ư���� �ʹ� ��Ȳ�ؼ� �б� ������������ �׷��� ������ �о����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 10;
		int[] lost = {1,4,10};
		int[] reserve = {9,4,2};
		int[] arr = new int[n+1];
		Arrays.sort(reserve);
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0 ; i<reserve.length ; i++) {
			hs.add(reserve[i]);
		}
		
		for(int i=0 ; i<lost.length ; i++) {
			if(hs.contains(lost[i])) hs.remove(lost[i]);
			else arr[lost[i]] = 1;
		}
		
		for(int i : hs) {
			if(i - 1 == 0) {
				arr[2] = 0;
				continue;
			}
			else if(i + 1 == arr.length) {
				arr[arr.length - 2] = 0;
				continue;
			}
			if(i - 1 > 0 && i + 1 < arr.length) {
				if(arr[i - 1] == 1) arr[i - 1] = 0;
				else if(arr[i + 1] == 1) arr[i + 1] = 0;
			}
		}
		
		int answer = 0;
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i] == 0) answer++;
		}
		
		System.out.println(answer);
	}
}
