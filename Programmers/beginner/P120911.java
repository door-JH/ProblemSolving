package Programmers.beginner;

import java.util.Arrays;

public class P120911 {

    public String solution(String my_string) {
        String answer = "";
        char[] str_arr = answer.toLowerCase().toCharArray();

        Arrays.sort(str_arr);
        
        for (char c : str_arr) {
            answer += c;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
