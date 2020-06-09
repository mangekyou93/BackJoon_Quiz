package q8000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8974 {
	
	//백준 문제 8974 : 희주의 수학시험
	//분류 : 반복문
	
	//문제 이해도 부족
	//구현력 부족
	//부족한게 아직 너무 많다...
	//그리고 일단 구현하자 뭐 메모리고 자시고 프로그램이 일단 돌아야지...
	//그 후에 시간 남으면 오답 체크하듯이 하면 됨
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] arr = new int[1001];
		int count = 0;
		int a = 1;
		
		for(int i=1 ; i<1001 ; ) {
			count = a;
			while(count-- > 0) {
				arr[i] = a;
				i++;
				
				if(i == 1001) break;
			}
			a++;
		}

		int sum = 0;
		for(int i=A ; i<=B ; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
