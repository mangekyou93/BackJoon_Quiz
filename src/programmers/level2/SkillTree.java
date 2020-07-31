package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {

	//level 2
	//프로그래머스 문제 : 스킬트리
	//Summer/Winter Coding(~2018)
	public static void main(String[] args) {
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		Queue<Character> q = new LinkedList<Character>();
		
		int answer = skill_trees.length;
		for(String s : skill_trees) {
			for(int i=0 ; i<skill.length() ; i++) {
				q.offer(skill.charAt(i));
			}
			
			for(int i=0 ; i<s.length() ; i++) {
				char ch = s.charAt(i);
				if(!q.contains(ch)) continue;
				
				if(q.peek() != ch) {
					answer--;
					break;
				}
				q.poll();
			}
			
			q.clear();
		}
		
		System.out.println(answer);
	}
	
}
