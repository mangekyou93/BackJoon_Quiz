package q3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {

	//���� ���� 3052 : ������
	public static void main(String[] args) throws Exception {
		
		//�迭 ���
		arrUse();
		
		
		//HashSet ���
		//HashSet�� �ߺ����Ҹ� ������� �ʴ´�.
		//HashSet�� ���� ������ ����.
		//hashSetUse();
	}
	
	static void arrUse() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			boolean[] arr = new boolean[42];
			
			for(int i=0 ; i<10 ; i++) {
				int a = Integer.parseInt(br.readLine());
				arr[a%42] = true;
			}
			
			int count = 0;
			
			for(boolean value : arr) {
				if(value) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void hashSetUse() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashSet<Integer> hs = new HashSet<Integer>();
			
			for(int i=0 ; i<10 ; i++) {
				int a = Integer.parseInt(br.readLine());
				hs.add(a%42);
			}
			
			System.out.println(hs.size());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
