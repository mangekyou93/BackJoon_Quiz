package q4000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4153 {

	//���� ���� 4153 : �����ﰢ��
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String[] text = br.readLine().split(" ");
			
			if(Integer.parseInt(text[0]) == 0) {
				break;
			}
			Arrays.sort(text);
			
		}
		System.out.println(sb);
		br.close();

	}

}
