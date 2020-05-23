package q15000;


public class Q15596 {

	//백준 문제 15596 : 정수 N개의 합
	//함수 단계
	public static void main(String[] args) {
		
	}
	
	long sum(int[] a) {
		long sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}
