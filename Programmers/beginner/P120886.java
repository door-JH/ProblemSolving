package Programmers.beginner;

import java.util.Arrays;

public class P120886 {

    public static int solution(String before, String after) {
        int answer = 1;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for(int i = 0; i < beforeArr.length; i++){
            if(beforeArr[i] != afterArr[i]) answer = 0;
        }
        
        
        return answer;
    }

    public static void main(String[] args) {
        solution("olleh", "hello");
    }
    
}
