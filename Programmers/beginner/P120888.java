package Programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class P120888 {
    
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();

        for(int q = 0; q < my_string.length(); q++){
            if(!list.contains(my_string.charAt(q))){
                list.add(my_string.charAt(q));
            }
        }

        for (Character character : list) {
            answer += character;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
