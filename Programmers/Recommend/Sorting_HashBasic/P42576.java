package Programmers.Recommend.Sorting_HashBasic;

import java.util.HashMap;

public class P42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String p : participant){
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion){
            if(map.getOrDefault(c, 0) > 0){
                map.put(c, map.get(c) - 1);
            }
        }
        
        for(String p : participant){
            if(map.get(p) == 1){
                answer = p;
            }
        }
        
        return answer;
    }
}
