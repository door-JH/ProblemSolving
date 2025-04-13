package Programmers.beginner;

import java.util.Arrays;

public class P120850 {

    public static int[] solution(String my_string) {
        int[] answer = {};
        String str = "";
        int cnt = 0;

        for(int q = 0; q < my_string.length(); q++){
            if((int) my_string.charAt(q) > 47 && (int) my_string.charAt(q) < 58){
                cnt++;
                str += my_string.charAt(q);
            }
        }
        answer = new int[cnt];
        for(int w = 0; w < cnt; w++){
            answer[w] = (int)str.charAt(w) - '0';
        }

        Arrays.sort(answer);
        
        return answer;
    }


    public static void main(String[] args) {
        //0 - 48 9 - 57
        solution("hi12392");
        
    }
}
