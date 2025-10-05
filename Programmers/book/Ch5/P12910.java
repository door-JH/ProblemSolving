package Programmers.book.Ch5;

import java.util.ArrayList;
import java.util.List;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }
        
        if(list.size() != 0){
            answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();
        } else {
            answer = new int[] {-1};
        }
        
        return answer;
    }
}
