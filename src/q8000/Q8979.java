package q8000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q8979 {

	//백준 문제 8979 : 올림픽
	//분류 : 구현
	static int[][] nation;
	static int count = 1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());		//나라 총 수
		int K = Integer.parseInt(st.nextToken());		//K번째 나라
		nation = new int[N][5];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			nation[i][0] = Integer.parseInt(st.nextToken());
			nation[i][1] = Integer.parseInt(st.nextToken());
			nation[i][2] = Integer.parseInt(st.nextToken());
			nation[i][3] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nation, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					if(o1[2] == o2[2]) {
						return Integer.compare(o2[3], o1[3]);//동메달
					}else {
						return Integer.compare(o2[2], o1[2]);//은메달
					}
				}else {
					return Integer.compare(o2[1], o1[1]);//금메달
				}
			}
		});
		
		System.out.println(Arrays.toString(nation[0]));
		System.out.println(Arrays.toString(nation[1]));
		System.out.println(Arrays.toString(nation[2]));
		System.out.println(Arrays.toString(nation[3]));
		System.out.println(Arrays.toString(nation[4]));
		System.out.println(Arrays.toString(nation[5]));
		System.out.println(Arrays.toString(nation[6]));
		
		for(int i=0 ; i<N ; i++) {
			
		}
	}
}
