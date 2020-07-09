package programmers.level1;

import java.util.Arrays;

public class NumberOfK {

	//level 1
	//프로그래머스 문제 : K번째 수
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];
        
      //남이 짠 코드 
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        /*
        //내 코드
        for(int i=0 ; i<commands.length ; i++){
            int k=0;
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for(int j=commands[i][0] ; j<=commands[i][1] ; j++){
                temp[k] = array[j-1];
                k++;
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        */
        System.out.println(Arrays.toString(answer));
    }
}
