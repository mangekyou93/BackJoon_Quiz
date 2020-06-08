package q1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Q1181 {

	//���� ���� 1181 : �ܾ� ����
	//�޸� : 33MB / �ð� : 0.36 s
	//�ߺ��� ������ HashSet ����� ���ۿ� ����..
	//Arrays.sort�� ���� ���ĺ� ������ ������ ��
	//���̷� �ٽ� append
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
 			
		for(int i=0 ; i<n ; i++) {
			hs.add(br.readLine());
		}
		
		//����  HashSet�� String�迭�� ����������,
		//�ٸ� �е��� ArrayList�� ����.
		//�׷��� Collections.sort�� �����.
		String[] s = new String[hs.size()];
		int count = 0;
		for(String word : hs) {
			s[count] = word;
			count++;
		}
 		
 		Arrays.sort(s);
 		
 		for(int i=1 ; i<51 ; i++) {
 			for(int j=0 ; j<s.length ; j++) {
 				
 				if(s[j].length() == i) {
 					sb.append(s[j]).append("\n");
 				}
 			}
 		}
 		System.out.println(sb);
	}
}
