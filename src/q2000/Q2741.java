package q2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Q2741 {

	
	//백준 문제 Q2741 : N 찍기
	//Buffer를 사용하면 코드의 길이는 증가한다. try-catch, import 등등
	//Buffer를 사용하는 것이 약 3배(맹목적인 것은 아님) 빠르다.
	public static void main(String[] args) {
		
		//Scanner, println 사용
		spUse();
		//Buffer 사용
		bUse();
		
	}
	
	static void spUse() {								//실행 결과  : 메모리 33968KB -> 34MB / 시간 684ms -> 0.6초 / 코드길이 232B
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println(i);
		}
		
	}
	
	static void bUse() {								//실행 결과  : 메모리 27468KB -> 28MB / 시간 204ms -> 0.2초 / 코드길이 607B
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			
			for(int i=1 ; i<=n ; i++) {
				bw.write(i+"\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
