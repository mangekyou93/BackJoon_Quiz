package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {

	//level 1
	//���α׷��ӽ� ���� : ���ڿ� �� ������� �����ϱ�
	public static void main(String[] args) {

		//String[] strings = {"sun", "bed", "car"};
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) == o2.charAt(n)) {
					for(int i=0 ; i<o1.length() ; i++) {
						if(o1.charAt(i) != o2.charAt(i)) return Integer.compare(o1.charAt(i), o2.charAt(i));
					}
				}
				return Integer.compare(o1.charAt(n), o2.charAt(n));
			}
			
		});
		
		System.out.println(Arrays.toString(strings));
	}
	
	//�ٸ� ��� Ǯ��
	 public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);			//���ؾ��� ����(n���� �ε���)�� �� ������ ����.
        }
        Collections.sort(arr);											//�� ���� ����
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());	//�� ���� �� �ձ��ڸ� ���� �迭�� ������ش�.
        }
        return answer;
    }
}
