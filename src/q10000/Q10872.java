package q10000;

import java.util.Scanner;

public class Q10872 {

	//백준 문제 10872 : 팩토리얼
	//1.
	//재귀호출이 너무 반복적으로 되면, 즉 재귀가 깊어지면 자바에서는 Stack OverFlow 라는 에러를 뱉는다.
	//재귀함수의 경우 함수를 반복적으로 호출하는 만큼 메모리에 스택이 되기 때문에 결국 메모리를 엄청나게 차지하게 된다. 그리고 재귀함수가 끝날 때는 함수를 닫으면서 스택된 메모리에서 pop 을 하기때문에 수행시간 또한 매우 느려진다.
	//결국 재귀호출을 하다가 메모리가 부족해지는 것과 성능이 저하되는 것이 일상이기 때문에 이러한 이유로 재귀호출은 평상시에 알고리즘 자체가 재귀가 자연스럽거나 호출을 많이 하지 않는 범위일 때 쓰이고 그 외에는 자주 쓰이지 않는다.
	//2.
	//재귀 함수가 끝나는 지점을 정확하게 구현해야한다.
	//이는 당연한 말이기도 하지만 특히나 재귀에서는 끝나는 지점이 명확하지 않으면 자칫 무한루프에 빠지기 쉽다.
	
	//채점 기준이 존나 뭐같네 ㅡㅡ
	//if(n == 1) return 1; << 이렇게 하면 런타임 에러
	//if(n <= 1) return 1; << 이렇게 하면 완료
	//솔직히 둘의 차이점은 없음.
	//n의 범위가 1 <= n <= 12이니까 0을 넣을 것도 아니고
	//좀 개같네..
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = factorial(n);
		System.out.println(sum);
		sc.close();
	}
	
	public static int factorial(int n) {
		//if(n == 1) return 1;
		if(n <= 1) return 1;
		
		return n * factorial(n-1);
	}

}
