package Programmers.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120903 {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list = new ArrayList<>();

        list = Arrays.asList(s2);

        for (String str : s1) {
            if(list.contains(str)) answer++;
        }
        

        return answer;
    }

    
    public static void main(String[] args) {
        
    }
}
