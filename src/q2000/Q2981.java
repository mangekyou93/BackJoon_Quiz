package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Q2981 {

	//백준 문제 2981 : 검문
	//메모리 : 14MB / 시간 : 0.092 s
	//v[i] = m * temp[i] + r
	//v[i] - v[i-1] = m *(temp[i] - temp[i-1]) + (r-r)		:: 나머지가 같아서 나머지를 제거해준다.
	
	//진짜 어렵다..
	//이걸 보고 어떻게 최대공약수의 약수라는 생각을 할 수가 있지...
	//진짜 대단하다ㅠ
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> hs = new HashSet<Integer>();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);									//오름차순 정렬 먼저 해주고
		
		int gcd = arr[1] - arr[0];							//34 - 6	= 28
		for(int i=2 ; i<arr.length ; i++) {					//38 - 34	= 4
			gcd = GCD(gcd, arr[i] - arr[i-1]);				//4와 28의 최대공약수 4	4에서 1을 제외한 약수 2 4가 정답
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2 ; i<=Math.sqrt(gcd) ; i++) {			//약수를 구할 때 1~n까지 돌리지 말고
															//루트를 사용해주면 O(n) -> O(log n)으로 줄어들 수 있다.
			if(gcd % i == 0) {
				al.add(i);									//i = 3이면
				al.add(gcd/i);								//3으로 나눈 몫도 약수가 되니까
			}
		}
		al.add(gcd);										//1을 뺀 자기 자신까지 약수
		Collections.sort(al);
		ArrayList<Integer> distinct = new ArrayList<Integer>();
		
		for(int i : al) {
			if(!distinct.contains(i)) distinct.add(i);		//중복 제거
		}
		
		for(int i : distinct) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
	
	public static int GCD(int a, int b) {
		
		if(b == 0) {
			return a;
		} else {
			return GCD(b, a%b);
		}
	}
}
