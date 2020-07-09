package q9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q9375 {

	//���� ���� 9375 : �мǿ� ���غ�
	//����� �� ����
	//���� 2��, ����1��, �Ź� 3�ӷ�	: (2+1)*(1+1)*(3+1) - 1 = 23
	//���� 3��, ����3��			: (3+1)*(3+1) - 1 = 15
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
	
		while(t-- > 0) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0 ; i<n ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String kind = st.nextToken();
				
				if(map.containsKey(kind)) {
					map.put(kind, map.get(kind)+1);
				} else {
					map.put(kind, 1);
				}
			}
			
			int count = 1;
			for(int value : map.values()) {
				count *= value + 1;
			}
			System.out.println(count - 1);
		}
	}
}
