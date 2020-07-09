package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1946 {
	
	//백준 문제 1946 : 신입 사원
	//분류 : 그리디 알고리즘
	//메모리 : 155MB / 시간 : 1.784 s
	//1차원 배열 사용시
	//메모리 : 130MB / 시간 : 0.46 s
	
	//1차원 배열
	//인덱스 번호 : 서류심사 성적 순위
	//값              : 면접 성적 순위
	//이렇게 해서 인덱스 1로 기준을 잡고
	//면접 성적 순위 비교하면서 count++하면 됨.
	static int[][] grade;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			grade = new int[N][2];
			
			for(int i=0 ; i<N ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				grade[i][0] = Integer.parseInt(st.nextToken());
				grade[i][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(grade, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);
					
					return Integer.compare(o1[0], o2[0]);
				}
			});
			
			getPass(N);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void getPass(int n) {
		
		int min = Integer.MAX_VALUE;
		int count = 0;
		for(int i=0 ; i<n ; i++) {
			if(grade[i][1] < min) {
				min = grade[i][1];
				count++;
			}
		}
		sb.append(count);
	}
}
