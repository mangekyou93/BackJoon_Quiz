package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2503 {

	//���� ���� 2503 : ���� �߱�
	//�з� : ���Ʈ ����
	
	//123 ~ 987���� ������
	//�ٵ� 130�̳� 133 �̷��Ŵ� �����ؾ���
	//�޸� : 13MB / �ð� : 0.084 s
	static int values[], strikes[], balls[];
	static int N;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		values = new int[N];
		strikes = new int[N];
		balls = new int[N];
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int value = Integer.parseInt(st.nextToken());
			int strike = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());
			
			values[i] = value;
			strikes[i] = strike;
			balls[i] = ball;
		}
		
		int answer = 0;
		
		
		for(int i=123 ; i<=987 ; i++) {
			if(baseball(i)) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
	
	public static boolean baseball(int n) {
		int h = n / 100;			// ���� �ڸ�
		int t = (n % 100) / 10;		// ���� �ڸ�
		int o = n % 10;				// ���� �ڸ�
		
		if(h == 0 || t == 0 || o == 0) return false;		// 0�� ������ false
		if(h == t || h == o || t == o) return false;		// �ߺ��� ������ false
		
		//������ ����� �ִ� ��ŭ for���� ����.
		//�ű⼭ ���� ���ϸ鼭 strike�� ball�� �� ���� ���ؼ� ��ġ�ϴ��� üũ
		//��ġ�ϸ� ���� ���ڷ� �Ѿ��, ����ġ�ϸ� ���� ���ڸ� üũ�Ϸ� baseball������ ����
		for(int i=0 ; i<N ; i++) {
			int v = values[i];
			int strike = 0, ball = 0;
			int hv = v / 100;
			int tv = (v % 100) / 10;
			int ov = v % 10;
			
			if(h == hv) strike++;
			if(t == tv) strike++;
			if(o == ov) strike++;
			
			if(h == tv || h == ov) ball++;
			if(t == hv || t == ov) ball++;
			if(o == hv || o == tv) ball++;
			
			if(strike != strikes[i] || ball != balls[i]) {
				return false;
			}
		}
		
		return true;
	}
}
