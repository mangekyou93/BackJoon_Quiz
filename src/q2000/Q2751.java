package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	//백준 문제 2751 : 수 정렬하기 2
	//Arrays.sort는 퀵 정렬이라서 평균 O(nlogn)이지만, 최악은 O(n^2)이다.		:: 시간 초과 나옴
	//Collections.sort는 Timsort라서 반복 합병 및 삽입정렬 알고리즘을 사용
	//합병 정렬 : 최선,최악 모두 O(nlogn)을 보장
	//삽입 정렬 : 최선 O(n), 최악 O(n^2)
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
