package q14000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14503 {

	//���� ���� 14503 : �κ� û�ұ�
	//�޸� : 14MB / �ð� : 0.088 s
	
	//���̿��� �����Ʊ⶧���� �ȵƴ���...
	//������ ��������
	static int[][] area;
	static boolean[][] visited;
	static Queue<int[]> q = new LinkedList<int[]>();
	static int count = 0;
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		area = new int[N][M];
		visited = new boolean[N][M];
		
		st = new StringTokenizer(br.readLine(), " ");
		q.offer(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0 ; j<M ; j++) {
				area[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs();
		System.out.println(count);
	}
	
	public static void bfs() {
		visited[q.peek()[0]][q.peek()[1]] = true;
		count++;
		
		while(!q.isEmpty()) {
			int[] t = q.poll();
			
			if(check(t)) {	//û���� ���� ���� ���
				count++;
			} else {		//���̻� û���� ���� ���� ���
				
				if(t[2] == 0) {			//���ʹ��� �ٶ󺸸鼭 �ڷ� ����
					if(area[t[0]+1][t[1]] != 1) q.offer(new int[] {t[0]+1, t[1], t[2]});
				}
				else if(t[2] == 1) {	//���ʹ��� �ٶ󺸸鼭 �ڷ� ����
					if(area[t[0]][t[1]-1] != 1) q.offer(new int[] {t[0], t[1]-1, t[2]});
				}
				else if(t[2] == 2) {	//���ʹ��� �ٶ󺸸鼭 �ڷ� ����
					if(area[t[0]-1][t[1]] != 1)q.offer(new int[] {t[0]-1, t[1], t[2]});
				}
				else {					//���ʹ��� �ٶ󺸸鼭 �ڷ� ����
					if(area[t[0]][t[1]+1] != 1)q.offer(new int[] {t[0], t[1]+1, t[2]});					
				}	
			}
		}
	}
	
	public static boolean check(int[] t) {
		int nd = t[2];
		
		if(t[2] == 0) {	//����
			int[] dx = {0, 1, 0, -1};
			int[] dy = {-1, 0, 1, 0};
			
			for(int i=0 ; i<4 ; i++) {
				
				int nx = t[0] + dx[i];
				int ny = t[1] + dy[i];
				nd = nd - 1 < 0 ? 3 : nd - 1;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if(area[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new int[] {nx, ny, nd});
						return true;
					}
				}
			}
			
		}else if(t[2] == 1) { //����
			int[] dx = {-1, 0, 1, 0};
			int[] dy = {0, -1, 0, 1};
			
			for(int i=0 ; i<4 ; i++) {
				int nx = t[0] + dx[i];
				int ny = t[1] + dy[i];
				nd = nd - 1 < 0 ? 3 : nd - 1;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if(area[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new int[] {nx, ny, nd});
						return true;
					}
				}
			}
			
		}else if(t[2] == 2) { //����
			int[] dx = {0, -1, 0, 1};
			int[] dy = {1, 0, -1, 0};
			
			for(int i=0 ; i<4 ; i++) {
				int nx = t[0] + dx[i];
				int ny = t[1] + dy[i];
				nd = nd - 1 < 0 ? 3 : nd - 1;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if(area[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new int[] {nx, ny, nd});
						return true;
					}
				}
			}
			
		}else { //����
			int[] dx = {1, 0, -1, 0};
			int[] dy = {0, 1, 0, -1};
			
			for(int i=0 ; i<4 ; i++) {
				int nx = t[0] + dx[i];
				int ny = t[1] + dy[i];
				nd = nd - 1 < 0 ? 3 : nd - 1;
				
				if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if(area[nx][ny] == 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new int[] {nx, ny, nd});
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
}
