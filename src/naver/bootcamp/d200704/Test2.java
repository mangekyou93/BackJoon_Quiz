package naver.bootcamp.d200704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
	
	static int[] answer = new int[5];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		
		LinkedList<Integer> A = new LinkedList<Integer>();
		LinkedList<Integer> B = new LinkedList<Integer>();
		
		for(int i=0 ; i<temp.length ; i++) {
			if(A.isEmpty()) A.add(Integer.parseInt(temp[i]));
			if(A.contains(Integer.parseInt(temp[i]))) continue;
			A.add(Integer.parseInt(temp[i]));
		}
		
		temp = br.readLine().split(" ");
		for(int i=0 ; i<temp.length ; i++) {
			if(B.isEmpty()) B.add(Integer.parseInt(temp[i]));
			if(B.contains(Integer.parseInt(temp[i]))) continue;
			B.add(Integer.parseInt(temp[i]));
		}
		
		answer[0] = A.size();
		answer[1] = B.size();
		answer[2] = sum(A, B);
		answer[3] = complement(A, B);
		answer[4] = intersect(A, B);
		
		System.out.println(Arrays.toString(answer));
	}
	
	//합집합
	public static int sum(List<Integer> a, List<Integer> b) {
		List<Integer> temp = new LinkedList<Integer>();
		for(int i=0 ; i<a.size() ; i++) {
			temp.add(a.get(i));
		}
		
		for(int i=0 ; i<b.size() ; i++) {
			if(!temp.contains(b.get(i))) {
				temp.add(b.get(i));
			}
		}
		
		return temp.size();
	}
	
	//차집합
	public static int complement(List<Integer> a, List<Integer> b) {
		List<Integer> temp;
		if(a.size() < b.size()) {
			temp = a;
			a = b;
			b = a;
		}
		
		int count = a.size();
		for(int i=0 ; i<a.size() ; i++) {
			for(int j=0 ; j<b.size() ; j++) {
				if(a.get(i) == b.get(j)) {
					count--;
					break;
				}
			}
		}
		
		return count;
	}
	
	//교집합
	public static int intersect(List<Integer> a, List<Integer> b) {
		int count = 0;
		
		for(int i=0 ; i<b.size() ; i++) {
			if(a.contains(b.get(i))) count++;
		}
		
		return count;
	}
}
