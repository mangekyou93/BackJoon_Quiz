package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5427 {

	//���� ���� 5427 : ��
	//�޸� : 91MB / �ð� : 0.820 s
	//���� �Ű��� ĭ �Ǵ� ���� "���� �������� ĭ"
	//"���� ���� �������� ĭ" : ���� ���� �̵����Ѿ� ��.
	static char[][] room;
	static int[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int W,H;
	static Queue<int[]> fire = new LinkedList<int[]>();			//�� �̵� ť
	static Queue<int[]> human = new LinkedList<int[]>();		//��� �̵� ť
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			room = new char[H][W];
			visited = new int[H][W];
			
			for(int i=0; i<H ; i++) {
				String s = br.readLine();
				for(int j=0 ; j<s.length(); j++) {
					char ch = s.charAt(j);
					room[i][j] = ch;
					
					//���� ����
					if(ch == '@') {
						human.offer(new int[] {i, j});
						visited[i][j] = 1;
					}
					
					//�� ��ġ ����
					else if(ch == '*') {
						fire.offer(new int[] {i,j});
						visited[i][j] = -1;
					}
				}
			}
			
			bfs();
			
			int count = Integer.MAX_VALUE;
			for(int i=0 ; i<H ; i++) {
				for(int j=0 ; j<W ; j++) {
					if((i == 0 || j == 0) || (i == H-1 || j == W-1)) {					//�𼭸� üũ
						if(visited[i][j] == 0 || visited[i][j] == -1) continue;			//��,��,�� �� üũ
						count = Math.min(count, visited[i][j]);
					}
				}
			}
			sb.append(count == Integer.MAX_VALUE ? "IMPOSSIBLE" : count).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	public static void bfs() {
		
		while(!human.isEmpty() || !fire.isEmpty()) {
			int hSize = human.size();
			int fSize = fire.size();
			
			//�� �̵� ����
			for(int i=0 ; i<fSize ; i++) {
				int[] f = fire.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = f[0] + dx[j];
					int ny = f[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
						if(room[nx][ny] == '.' && visited[nx][ny] == 0) {
							room[nx][ny] = '*';
							visited[nx][ny] = -1;
							fire.offer(new int[] {nx, ny});
						}
					}
				}
			}
			
			//��� �̵� ����
			for(int i=0 ; i<hSize ; i++) {
				int[] h = human.poll();
				
				for(int j=0 ; j<4 ; j++) {
					int nx = h[0] + dx[j];
					int ny = h[1] + dy[j];
					
					if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
						if(room[nx][ny] == '.' && visited[nx][ny] == 0) {
							visited[nx][ny] = visited[h[0]][h[1]] + 1;
							human.offer(new int[] {nx, ny});
						}
					}
				}
			}
		}
	}
}
