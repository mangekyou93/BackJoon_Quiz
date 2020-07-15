package programmers.level1;

import java.util.Arrays;

public class SecretMap {

	//level 1
	//프로그래머스 문제 : 비밀지도
	//2018 KAKAO BLIND RECRUITMENT
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		Arrays.fill(answer, "");
		
		for(int i=0 ; i<n ; i++) {
			StringBuilder sb = new StringBuilder();
			String s1 = Integer.toString(arr1[i], 2);
			while(s1.length() < n) {
				s1 = "0"+s1;
			}
			String s2 = Integer.toString(arr2[i], 2);
			while(s2.length() < n) {
				s2 = "0"+s2;
			}
			
			for(int j=0 ; j<n ; j++) {
				if(s1.charAt(j) == '0' && s2.charAt(j) == '0') {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
			}
		}
	}
	
	//다른 사람 풀이
	//toBinaryString이란게 있어서 그걸로 or연산 해줌..
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
