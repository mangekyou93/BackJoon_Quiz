package programmers.level1;

public class PushTheKeypad {

	//level 1
	//프로그래머스 문제 : 키패드 누르기
	//2020 카카오 인턴십 
	static int[][] key = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};
	static int[] left = {3,0};
	static int[] right = {3,2};
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<numbers.length ; i++) {
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {				//left
				left = key[numbers[i]];
				sb.append("L");
				
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {		//right
				right = key[numbers[i]];
				sb.append("R");
				
			} else {																//mid
				int x = key[numbers[i]][0];
				int y = key[numbers[i]][1];
				
				//오른손이 더 먼 경우
				if(Math.abs((x-left[0])) + Math.abs((y-left[1])) < Math.abs((x-right[0])) + Math.abs((y-right[1]))) {
					left = key[numbers[i]];
					sb.append("L");
					
				} 
				//왼손이 더 먼 경우
				else if(Math.abs((x-left[0])) + Math.abs((y-left[1])) > Math.abs((x-right[0])) + Math.abs((y-right[1]))) {
					right = key[numbers[i]];
					sb.append("R");
				} 
				//같은 경우
				else {
					if(hand.equals("right")) {
						right = key[numbers[i]];
						sb.append("R");
					} else {
						left = key[numbers[i]];
						sb.append("L");
					}
				}
			}
		}
		
		System.out.println(sb);
	}
	
}
