package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1987 {

	//���� ���� 1987 : ���ĺ�
	//�޸� : 365MB / �ð� : 4.340 s
	
	//�ð��� �޸𸮰� ��û ���� ������
	//���ö����� �׷��� ������...
	
	//ť�� �޸� �ʰ� ����
	//String + String.valueOf + contains�� ����ؼ� �׷���??
	//�ٵ� ť�� ���ÿ� �迭�� ���ϰ�...
	//visited�� ���ڴ� ���� ���� �޶�ߵǴϱ� �ȵ� �� ����...
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static char[][] arr;
	static Stack<Board> stack = new Stack<Board>();
	static Queue<Board> q = new LinkedList<Board>();
	static int R, C, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new char[R][C];
		
		for(int i=0 ; i<R ; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		stack.push(new Board(0, 0, String.valueOf(arr[0][0]), 1));
		q.offer(new Board(0, 0, String.valueOf(arr[0][0]), 1));
		bfs();
		
		System.out.println(count);
	}
	
	public static void dfs() {
		
		while(!stack.isEmpty()) {
			int sSize = stack.size();
			
			for(int i=0 ; i<sSize ; i++) {
				Board b = stack.pop();
				
				for(int j=0 ; j<4 ; j++) {
					
					int nx = b.x + dx[j];
					int ny = b.y + dy[j];
					
					if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
						
						if(!b.visited.contains(String.valueOf(arr[nx][ny]))) {
							stack.push(new Board(nx, ny, b.visited+arr[nx][ny], b.score+1));
						} else {
							count = Math.max(count, b.score);
						}
					}
				}
			}
		}
		
	}
	
	public static void bfs() {
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			
			for(int i=0 ; i<qSize ; i++) {
				Board b = q.poll();
				
				for(int j=0 ; j<4 ; j++) {
					
					int nx = b.x + dx[j];
					int ny = b.y + dy[j];
					
					if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
						
						if(!b.visited.contains(String.valueOf(arr[nx][ny]))) {
							q.offer(new Board(nx, ny, b.visited+arr[nx][ny], b.score+1));
						} else {
							count = Math.max(count, b.score);
						}
					}
				}
			}
		}
		
	}
	
	
	public static class Board{
		
		int x;
		int y;
		String visited;
		int score;
		
		public Board(int a, int b, String c, int d) {
			this.x = a;
			this.y = b;
			this.visited = c;
			this.score = d;
		}
		
	}
	
	/*
	//�ٸ� ��� Ǯ��
	//�޸� : 14MB / �ð� : 1.036 s
	//visited�� �ؼ� dfs�ϱ� �� �� true���ߴٰ�
	//�����鼭 false�� ���ָ� �ٸ� ��η� Ž���� �� false�� ���·� ������ ������...
	//����Ŭ ���� �� ����ϴ� ����� �����.
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] arr;
	static boolean[] visited = new boolean[26];
	static int R, C, count = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new int[R][C];
		
		for(int i=0 ; i<R ; i++) {
			String s = br.readLine();
			for(int j=0 ; j<C ; j++){
				arr[i][j] = s.charAt(j) - 'A';
			}
		}
		
		dfs(0,0,0);
		
		System.out.println(count);
	}
	
	public static void dfs(int x, int y, int score) {
		if(visited[arr[x][y]]){
			count = Math.max(count, score);
			return ;
		} else {
			visited[arr[x][y]] = true;
			
			for(int i=0 ; i<4 ; i++){
			
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx >= 0 && nx < R && ny >= 0 && ny < C) {
					dfs(nx, ny, score+1);
				}
			}
			visited[arr[x][y]] = false;
		}
	}
	 */
	
}
