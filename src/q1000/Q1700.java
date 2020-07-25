package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1700 {

	//���� ���� 1700 : ��Ƽ�� �����ٸ�
	//�޸� : 14MB / �ð� : 0.080 s
	
	//�׸��� ��¥ ���ܸ� �� �����ؾ���..
	//���ܰ� �ʹ� ����...
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		HashSet<Integer> concent = new HashSet<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<K ; i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0;
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			if(concent.isEmpty()) concent.add(temp);
			else {
				if(concent.contains(temp)) continue;
				else {
					if(concent.size() < N) {
						concent.add(temp);
					} else {
						int max = 0;
						boolean check = true;
						
						for(int a : concent) {
							if(q.contains(a)) {
								max = Math.max(max, q.indexOf(a));
							} else {
								max = a;
								check = false;
								break;
							}
						}
						
						if(check) {
							concent.remove(q.get(max));
							concent.add(temp);
						} else {
							concent.remove(max);
							concent.add(temp);
						}
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
