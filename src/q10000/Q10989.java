package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10989 {

	//백준 문제 10989 : 수 정렬하기 3
	//카운팅 정렬이라는 걸 사용 : 숫자가 중복될 때 배열의 인덱스 == 숫자
	//인덱스 4인 배열이 5개면 arr[4] = 5 이므로 정렬시 ~ 4 4 4 4 4 ~		<-- 이런식으로 정렬 가능
	//시간복잡도 : O(N+K), K는 자릿수
	//데이터가 많으면 많을 수록 O(N)에 가깝기때문에 O(N)이라고 볼 수 있음.
	
	//메모리 : 446MB / 시간 : 1.532 s
	public static void main(String[] args) throws Exception{
		
		int[] cnt = new int[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i=1 ; i<cnt.length ; i++) {
			
			//예제에서 중복된 값이 있기 때문에
			//카운트가 꼭 1만 있는 것은 아니므로
			while(cnt[i] > 0) {
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}

}
