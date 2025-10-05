package Programmers.Recommend.String_Array;

import java.util.*;

public class P12931 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        
        for(int i = 0; i < str.length(); i++){
            answer += str.charAt(i) - '0';
        }

        return answer;
    }
}
