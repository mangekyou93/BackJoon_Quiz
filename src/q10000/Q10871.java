package q10000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10871 {
	
	//�Է�
	//ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
	//��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

	//���
	//X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
	
	//���� ���� 10871 : X���� ���� ��
	public static void main(String[] args) {
		
		//Scanner, sysout ���
		//���� : �ð� �ʰ�, �޸� �ʰ� / 1.068�� , 345MB
		//spUse();
		
		//Buffer ���
		//���� : 0.12�� , 16MB
		bUse();
		
	}
	
	static void spUse() {
		/*
		// O(N)�� �ð����⵵ , �������⵵ ���� N���� ���� �����ؾ� �ϹǷ� O(N)�� �˴ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int n,x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int[] a = new int[n];				//�������⵵ O(N)
		
		for(int i=0 ; i<a.length ; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++) {
			if(a[i] < x) {
				answer += a[i]+" ";
			}
		}
		
		System.out.println(answer);
		*/
		
		// O(N)�� �ð����⵵ , �������⵵�� O(1)
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int n,x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		for(int i=0 ; i<n ; i++) {
			int a = sc.nextInt();
			if(a < x) {
				answer += a+" ";
			}
		}
		
		System.out.println(answer);
	}
	
	static void bUse() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextElement().toString());
			int x = Integer.parseInt(st.nextElement().toString());
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i=0 ; i<n ; i++) {
				int a = Integer.parseInt(st.nextElement().toString());
				if(a<x) {
					bw.write(a+" ");
				}
			}
			
			bw.flush();
			bw.close();
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
