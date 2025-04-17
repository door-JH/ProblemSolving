package Programmers.beginner;

import java.util.ArrayList;
import java.util.List;

public class P120905 {

    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i : numlist) {
            if(i % n == 0) list.add(i);
        }

        answer = new int[list.size()];

        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
