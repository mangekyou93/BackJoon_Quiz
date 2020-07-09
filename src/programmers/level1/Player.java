package programmers.level1;

import java.util.HashMap;
import java.util.Iterator;

public class Player {
	
	//level 1
	//프로그래머스 문제 : 완주하지 못한 선수
	public static void main(String[] args) throws Exception {
		
		String answer = "";
		String[] participant = {"stanko", "mislav", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0 ; i<participant.length ; i++) {
        	if(map.containsKey(participant[i])) map.put(participant[i], map.get(participant[i])+1);
        	else map.put(participant[i], 1);
        	
        	if(i < completion.length) {
        		if(map.containsKey(completion[i])) map.put(completion[i], map.get(completion[i])-1);
            	else map.put(completion[i], -1);
        	}
        }
        
        Iterator<String> iter = map.keySet().iterator();
        
        while(iter.hasNext()) {
        	String s = iter.next();
        	if(map.get(s) == 1){
        		answer = s;
        		break;
        	}
        }
        
        //남의 풀이
        /*
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for(String player : completion) hm.put(player, hm.get(player) - 1);
        
        for(String key : hm.keySet()) {
        	if(hm.get(key) == 1) {
        		answer = key;
        		break;
        	}
        }
        System.out.println(answer);
        */
	}
}
