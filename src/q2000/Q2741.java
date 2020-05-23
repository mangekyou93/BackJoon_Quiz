package q2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Q2741 {

	
	//���� ���� Q2741 : N ���
	//Buffer�� ����ϸ� �ڵ��� ���̴� �����Ѵ�. try-catch, import ���
	//Buffer�� ����ϴ� ���� �� 3��(�͸����� ���� �ƴ�) ������.
	public static void main(String[] args) {
		
		//Scanner, println ���
		spUse();
		//Buffer ���
		bUse();
		
	}
	
	static void spUse() {								//���� ���  : �޸� 33968KB -> 34MB / �ð� 684ms -> 0.6�� / �ڵ���� 232B
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			System.out.println(i);
		}
		
	}
	
	static void bUse() {								//���� ���  : �޸� 27468KB -> 28MB / �ð� 204ms -> 0.2�� / �ڵ���� 607B
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			
			for(int i=1 ; i<=n ; i++) {
				bw.write(i+"\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
