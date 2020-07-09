package programmers.level1;

import java.util.Stack;

public class Crane {

	//level 1
	//프로그래머스 문제 : 크레인 인형뽑기 게임
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0 ; i<moves.length ; i++){
            int a = 0;
            for(int j=0 ; j<board.length ; j++){
                if(board[j][moves[i]-1] != 0) {
                    a = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
            
            if(a == 0) continue;
            if(stack.isEmpty()) stack.push(a);
            else if(stack.peek() == a) {
                stack.pop();
                answer += 2;
            } else {
            	stack.push(a);
            }
        }
        
        System.out.println(answer);
    }
}
