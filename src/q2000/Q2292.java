package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2292 {

	//백준 문제 2292 : 벌집
	//배열 다 필요없음 :::: 범위, 카운트 설정 후 계속해서 범위를 더해준 뒤 비교하고 카운트 출력...
	//많이 부족하다......
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		int index = 0;
		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(1);
		} else {
			while (true) {
				arr.add((index+1) * 6 + arr.get(index));
				index++;
				if(n - arr.get(index) <= 0) {
					break;
				}
			}
			
			System.out.println(arr.size());
		}
	}
}
