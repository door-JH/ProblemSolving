package Programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class P120897 {

    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();


        for(int q = 1; q <= n; q++){
            if(n % q == 0){
                list.add(q);
            }
        }
        answer = new int[list.size()];

        for(int w = 0; w < answer.length; w++){
            answer[w] = list.get(w);
        }

        return answer;
    }

    
    public static void main(String[] args) {
        solution(24);
    }
}
