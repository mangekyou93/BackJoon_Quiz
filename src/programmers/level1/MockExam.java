package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {

	//level 1
	//프로그래머스 문제 : 모의고사
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
        int[] answer = {0,0,0};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        
        
        for(int i=0 ; i<answers.length ; i++){
            if(aCount > a.length - 1) aCount = 0;
            if(bCount > b.length - 1) bCount = 0;
            if(cCount > c.length - 1) cCount = 0;
            
            if(answers[i] == a[aCount]) answer[0]++;
            if(answers[i] == b[bCount]) answer[1]++;
            if(answers[i] == c[cCount]) answer[2]++;
            
            aCount++;
            bCount++;
            cCount++;
        }
        
        while(true){
            if(answer[0] == 0 && answer[1] == 0 && answer[2] == 0) {
            	answer = new int[3];
            	answer[0] = 1;
            	answer[1] = 2;
            	answer[2] = 3;
                break;
            }
            if(answer[0] == 0) {
                if(answer[1] > answer[2]){
                	answer = new int[1];
                	answer[0] = 2;
                } else if(answer[2] > answer[1]){
                	answer = new int[1];
                	answer[0] = 3;
                } else {
                	answer = new int[2];
                	answer[0] = 2;
                	answer[1] = 3;
                }
                break;
            }
            if(answer[1] == 0) {
                if(answer[0] > answer[2]){
                	answer = new int[1];
                	answer[0] = 1;
                } else if(answer[2] > answer[0]){
                	answer = new int[1];
                	answer[0] = 3;
                } else {
                	answer = new int[2];
                	answer[0] = 1;
                	answer[1] = 3;
                }
                break;
            }
            if(answer[2] == 0) {
                if(answer[0] > answer[1]){
                	answer = new int[1];
                	answer[0] = 1;
                } else if(answer[1] > answer[0]){
                	answer = new int[1];
                	answer[0] = 2;
                } else {
                	answer = new int[2];
                	answer[0] = 1;
                	answer[1] = 2;
                }
                break;
            }
            
            answer[0]--;
            answer[1]--;
            answer[2]--;
        }
        System.out.println(Arrays.toString(answer));
        
        //남의 코드
        int[] score = new int[3];
        for(int i=0 ; i<answer.length ; i++) {
        	if(answer[i] == a[i%a.length]) score[0]++;
        	if(answer[i] == b[i%b.length]) score[1]++;
        	if(answer[i] == c[i%c.length]) score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(maxScore == score[0]) list.add(1);
        if(maxScore == score[1]) list.add(2);
        if(maxScore == score[2]) list.add(3);
        
        //이건 stream : java 8부터 사용한다.
        //공부해두는 것이 가독성에 좋을 듯하다.
        list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
