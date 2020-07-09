package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {

	//���� ���� 2609 : �ִ������� �ּҰ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}
	
	//�ִ�����
	public static int gcd(int a, int b) {
		int gcd = 1;
		for(int i=Math.min(a, b) ; i>0 ; i--) {
			
			if(a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}
	
	//��Ŭ���� ȣ����(�ݺ���)
	public static int gcd2(int a, int b) {
		int n;
		
		if(a < b) {			//ū ���� �˾ƾ���.
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		while(b != 0) {
			n = a%b;
			a = b;
			b = n;
		}
		
		return a;
	}
	
	//��Ŭ���� ȣ����(���)
	public static int gcd3(int a, int b) {
		
		if(b == 0) {
			return a;
		} else {
			return gcd3(b, a%b);
		}
	}
	
	
	//�ּҰ����
	public static int lcm(int a, int b) {
		int lcm = 1;
		for(int i=Math.min(a, b) ; i>0 ; i--) {
			
			if(a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
				
				lcm *= i;
			}
		}
		
		return lcm * a * b;
	}
}
