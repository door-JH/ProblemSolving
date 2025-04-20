package Programmers.beginner;

import java.util.Arrays;

public class P120912 {

    public static int solution(int[] array) {
        int answer = 0;
        String arrStr = Arrays.toString(array);

        for(int i = 0; i < arrStr.length(); i++){
            
            if(arrStr.charAt(i) == '7') answer++;
        }



        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {7, 77, 17};
        solution(arr);
    }
}
