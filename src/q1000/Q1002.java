package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {

	//백준 문제 1002 : 터렛
	//문제를 이해 못했음...
	//A -> C : r1 , A의 위치(x1,y1)
	//B -> C : r2 , B의 위치(x2,y2)
	//반지름이 r1인 원a와 반지름이 r2인 원b의 접점의 개수를 구하는 것
	//수학 공부도 필요하네...
	//사실 문제를 풀면서 설명을 봐도 공식이 이해가 안됨.
	//문제 풀이는 이해가 감.
	
	//1. r1=r2, 중심이 같을 때					: 접점의 개수가 무한대
	//2. 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때	: 접점이 없다
	//3. 큰 원 안에 작은 원이 있으면서 접점이 없을 때		: 접점이 없다
	//4. 내접할 때								: 접점이 1개
	//5. 외접할 때								: 접점이 1개
	//6. 나머지								: 접점이 2개
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			//Math.sqrt를 안하는 이유는 double, float에서 복소수 부분에서 0.1 + 0.2 != 0.3 때문에(비트 부분)
			//그냥 제곱을 이용해서 푼다.
			int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			//1. r1=r2, 중심이 같을 때					: 접점의 개수가 무한대
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				sb.append(-1).append("\n");
			}
			//2. 두 점 사이의 거리가 각 원의 반지름의 합보다 클 때	: 접점이 없다
			else if(distance_pow > Math.pow(r1 + r2,2)) {
				sb.append(0).append("\n");
			}
			//3. 큰 원 안에 작은 원이 있으면서 접점이 없을 때		: 접점이 없다
			else if(distance_pow < Math.pow(r2 - r1,2)) {		//제곱이라 음수나와도 상관 없음
				sb.append(0).append("\n");
			}
			//4. 내접할 때								: 접점이 1개
			else if(distance_pow == Math.pow(r2 - r1,2)) {
				sb.append(1).append("\n");
			}
			//5. 외접할 때								: 접점이 1개
			else if(distance_pow == Math.pow(r2 + r1,2)) {
				sb.append(1).append("\n");
			}
			//6. 나머지								: 접점이 2개
			else {
				sb.append(2).append("\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}

}
