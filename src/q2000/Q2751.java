package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	//���� ���� 2751 : �� �����ϱ� 2
	//Arrays.sort�� �� �����̶� ��� O(nlogn)������, �־��� O(n^2)�̴�.		:: �ð� �ʰ� ����
	//Collections.sort�� Timsort�� �ݺ� �պ� �� �������� �˰����� ���
	//�պ� ���� : �ּ�,�־� ��� O(nlogn)�� ����
	//���� ���� : �ּ� O(n), �־� O(n^2)
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for(int i=0 ; i<n ; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(al);
		for(int i=0 ; i<al.size() ; i++) {
			sb.append(al.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}

}
