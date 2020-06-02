package q4000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {

	//백준 문제 4948 : 베르트랑 공준
	//베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
	//메모리 : 27MB / 시간 : 0.156 s
	//메모리
	//1. boolean[]을 계속 만들어서 많이 나왔을 것
	//2. n의 범위가 123456이므로 처음 만들 때 246912 + 1로 만들면 좀 더 적게 나왔을 듯
	//1,2번 모두 해보니 27MB -> 15MB로 변경	--> 좋은 코딩 습관은 메모리 할당을 계속 해야되는 것인지 아닌지를 잘 파악해야한다.
	
	//시간
	//1. 소수 판별을 처음 prime배열 초기화 시 해준다
	//2. BufferedWriter, OutputStreamWrtier 보다 StringBuilder를 사용했으면 더 빠를 것
	//흠 예상 실패... 할 때마다 계속 시간이 달라짐..
	public static void main(String[] args) throws Exception {
		boolean[] prime = new boolean[246913];
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<= Math.sqrt(prime.length) ; i++) {
			if(prime[i]) continue;
			for(int j=i*i ; j<prime.length ; j += i) {
				prime[j] = true;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			} else if(n == 1) {
				sb.append("1\n");
				//bw.append("1\n");
			} else {
				//boolean[] prime = new boolean[2 * n + 1];
				/*
				prime[0] = true;
				prime[1] = true;
				
				for(int i=2 ; i<= Math.sqrt(prime.length) ; i++) {
					if(prime[i]) continue;
					for(int j=i*i ; j<prime.length ; j += i) {
						prime[j] = true;
					}
				}
				*/
				int count = 0;
				
				for(int i=n+1 ; i<2*n ; i++) {
					if(!prime[i]) count++;
				}
				sb.append(count+"\n");
				//bw.append(count+"\n");
			}
		}
		System.out.println(sb);
		//bw.flush();
		//bw.close();
		br.close();
	}
}
