package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2292 {

	//���� ���� 2292 : ����
	//�迭 �� �ʿ���� :::: ����, ī��Ʈ ���� �� ����ؼ� ������ ������ �� ���ϰ� ī��Ʈ ���...
	//���� �����ϴ�......
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		int index = 0;
		int n = Integer.parseInt(br.readLine());
		
		if(n == 1) {
			System.out.println(1);
		} else {
			while (true) {
				arr.add((index+1) * 6 + arr.get(index));
				index++;
				if(n - arr.get(index) <= 0) {
					break;
				}
			}
			
			System.out.println(arr.size());
		}
	}
}
