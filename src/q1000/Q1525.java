package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1525 {

	//백준 문제 1525 : 퍼즐
	//메모리 : 135MB / 시간 : 0.724 s
	
	//퍼즐 게임 만들어봄...
	//2차원 배열을 1차원 배열로 바꿀때 int로만 바꿀 수 있다는게 너무 신기함.
	//10^9 어림잡아 2^30과 비슷하니까
	//9자리 숫자가 제한인 int를 사용해도 괜찮다.
	//맵을 이용해서 visited를 만든 것도 진짜 대단하다..
	static int[] puzzle = new int[9];
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int count = 0;
	static Queue<Integer> q = new LinkedList<Integer>();
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//2차원 퍼즐을 1차원으로 바꿔준다?
		int start = 0;
		for(int i=0 ; i<3 ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<3 ; j++) {
				int temp = Integer.parseInt(st.nextToken());
				// 0일 때 9로 변환
				// 0만 9로 변한다는 것만 빼면, 배열처럼 1934.... 이렇게 변환 됨
				if(temp == 0) temp = 9;
				start = (start * 10) + temp;
			}
		}
		
		q.offer(start);
		map.put(start, 0);
		
		System.out.println(bfs());
	}
	
	public static int bfs() {
		
		while(!q.isEmpty()) {
			
			int curr = q.poll();
			String curr_str = String.valueOf(curr);
			
			if(curr_str.equals("123456789")) {
				return map.get(curr);
			}
			
			int nine = curr_str.indexOf('9');
			// 현재 9(== 0)의 좌표를 알아낸다.
			// 몫 연산은 행, 나머지 연산은 열을 나타낸다.
			int r = nine / 3;	//행
			int c = nine % 3;	//열
			
			for(int i=0 ; i<4 ; i++) {
				int nr = r + dx[i];
				int nc = c + dy[i];
				
				if(nr >= 0 && nc >= 0 && nr < 3 && nc < 3) {
					StringBuilder next_str = new StringBuilder(curr_str);
					// r * 3 + c는 좌표의ㅣ 1차원 배열에서의 위치이다.
					// 이전 9의 위치와 다음 위치의 숫자를 바꾼다.
					char temp = next_str.charAt(nr * 3 + nc);
					next_str.setCharAt(nr * 3 + nc, '9');
					next_str.setCharAt(nine, temp);
					
					int next = Integer.parseInt(next_str.toString());
					
					//맵에 없는(나온적 없는 퍼즐의 상태) 경우에는 맵에 추가한다. :: visited와 비슷한 역활
					if(!map.containsKey(next)) {
						map.put(next, map.get(curr) + 1);
						q.offer(next);
					}
				}
			}
		}
		
		//안나오는 경우
		return -1;
	}
}
