package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2810 {
	
	//백준 문제 2810 : 컵홀더
	//분류 : 반복문
	//틀린 것을 찾아내는 것도 엄청 도움이 될 듯하다.
	//틀렸다고 무작정 왜지? 맞는데라는 태도 보다는
	//입력 예제를 많이 해봐야 나중에 오답체크를 할 수 없는 코테에서 유리하다.
	public static void main(String[] args) throws Exception {
		
		//사람 수를 찾는 것이지 컵홀더 갯수를 찾는 것이 아님.
		//ex) S  -> *S*		: 2(x) 1(o)
		//	  SS -> *S*S*	: 3(x) 2(o)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine().toUpperCase();
		int count = 0;
		
		if(!s.contains("LL")) {
			sb.append(n);
		} else {
			for(int i=0 ; i<s.length() ; i++) {
				if(s.charAt(i) == 'S') {
					count++;
				} else if(s.charAt(i) == 'L') {
					count++;
					i++;
				}
			}
			sb.append(count+1);
		}
		
		System.out.println(sb);
	}

}
