package Programmers.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;

public class P42889 {
    
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] challengers = new int[N + 2];
        int people = 0;
        HashMap<Integer, Double> map = new HashMap<>();

        for(int i = 0; i < stages.length; i++){
            challengers[stages[i]] += 1;
        }
        for (int i : challengers) {
            people += i;
        }

        for(int i = 1; i < challengers.length; i++){

            people -= challengers[i - 1];
            
            map.put(i, (double)challengers[i] / people);
        }
        //????
    
        answer = Arrays.copyOfRange(map.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray(), 1, N);
        return answer;
    }


    public static void main(String[] args) {

        Integer[] arr = {5,2,6,1,4};

        Arrays.sort(arr, Collections.reverseOrder());
        
       
        // solution(4, arr);
    }
}
