package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9019 {

	//백준 문제 9019 : DSLR
	
	//생각을 잘못함..
	//S버튼은 일단 0이되고 난 후에 또 누르면 9999가 됨 s = s - 1 ? 9999 : s - 1이 아니라 s = s ? 9999 : s - 1임.
	//L,R 버튼은 굳이 String으로 안해도 식으로 만들 수 있음..
	
	//배열 역추적하는게 시간이나 메모리가 덜 나올 것으로 예상함
	//사실상 메모리는 실패
	//메모리 : 367MB / 시간 : 3.260s
	private static class Register {
		int register;
		String str;
		
		Register(int register, String str) {
			this.register = register;
			this.str = str;
		}
	}
	
	static boolean[] visited = new boolean[10000];
	static StringBuilder sb = new StringBuilder();
	static Queue<Register> q = new LinkedList<Register>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			q.clear();
			Arrays.fill(visited, false);
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bfs(A, B);
		}
		
		System.out.println(sb);
	}
	
	public static void bfs(int A, int B) {
		q.offer(new Register(A, ""));
		
		while(!q.isEmpty()) {
			Register regi = q.poll();
			
			if(regi.register == B) {
				sb.append(regi.str).append("\n");
				return ;
			}
			
			int d = (regi.register * 2) % 10000;
			int s = regi.register == 0 ? 9999 : regi.register - 1;
			int l = ((regi.register % 1000) * 10) + (regi.register / 1000);
			int r = ((regi.register % 10) * 1000) + (regi.register / 10);
			
			if(!visited[d]) {
				visited[d] = true;
				q.offer(new Register(d, regi.str + "D"));
			}
			if(!visited[s]) {
				visited[s] = true;
				q.offer(new Register(s, regi.str + "S"));
			}
			if(!visited[l]) {
				visited[l] = true;
				q.offer(new Register(l, regi.str + "L"));
			}
			if(!visited[r]) {
				visited[r] = true;
				q.offer(new Register(r, regi.str + "R"));
			}
		}
	}
}
