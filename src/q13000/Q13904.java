package q13000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q13904 {

	//백준 문제 13904 : 과제
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] report = new int[N][2];
		int maxDay = 0;
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			report[i][0] = Integer.parseInt(st.nextToken());
			report[i][1] = Integer.parseInt(st.nextToken());
			maxDay = Math.max(maxDay, report[i][0]);
		}
		
		Arrays.sort(report, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return Math.max(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		int[] start = report[0];
		
		for(int i=1 ; i<=maxDay ; i++) {
			
			
			
			for(int j=0 ; j<N ; j++) {
				if(report[j][0] == i) {
					report[j][1] = -1;
				}
			}
		}
		
	}
}
