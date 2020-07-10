package q6000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6593 {

	//백준 문제 6593 : 상범 빌딩
	//메모리 : 18MB / 시간 : 0.144 s
	static int L, R, C;
	static char[][][] building;
	static boolean[][][] visited;
	static int[][] moves = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if(L == 0 && R == 0 && C == 0) {
				break;
			}
			building = new char[L][R][C];
			visited = new boolean[L][R][C];
			
			for(int i=0 ; i<L ; i++) {
				for(int j=0 ; j<R ; j++) {
					String s = br.readLine();
					building[i][j] = s.toCharArray();
				}
				br.readLine();
			}
			start();
		}
		
		System.out.println(sb);
	}
	
	public static void start() {
		for(int i=0 ; i<L ; i++) {
			for(int j=0 ; j<R ; j++) {
				for(int k=0 ; k<C ; k++) {
					if(building[i][j][k] == 'S') {
						sb.append(bfs(i,j,k)).append("\n");
						return ;
					}
				}
			}
		}
	}
	
	public static String bfs(int z, int x, int y) {
		visited[z][x][y] = true;
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {z,x,y,0});
		
		while(!q.isEmpty()) {
			int qSize = q.size();
			
			for(int i=0 ; i<qSize ; i++) {
				int[] curr = q.poll();
				
				if(building[curr[0]][curr[1]][curr[2]] == 'E') {
					return "Escaped in "+(curr[3])+" minute(s).";
				}
				
				for(int j=0 ; j<6 ; j++) {
					int nz = curr[0] + moves[j][0];
					int nx = curr[1] + moves[j][1];
					int ny = curr[2] + moves[j][2];
					
					if(nz >= 0 && nx >= 0 && ny >= 0 && nz < L && nx < R && ny < C) {
						if(!visited[nz][nx][ny] && building[nz][nx][ny] != '#') {
							visited[nz][nx][ny] = true;
							q.offer(new int[] {nz,nx,ny,curr[3]+1});
						}
					}
				}
			}
		}
		
		return "Trapped!";
	}
}
