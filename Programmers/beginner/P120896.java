package Programmers.beginner;


import java.util.Arrays;


public class P120896 {

    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for(int q = 0; q < arr.length; q++){
            cnt = 0;
            for(int w = 0; w < arr.length; w++){
                if(arr[q] == arr[w]){
                    cnt++;
                }
            }

            if(cnt == 1) answer += arr[q];
        }

        return answer;
    }

    public static void main(String[] args) {
        solution("abcabcadc"); 
        
    }
}
