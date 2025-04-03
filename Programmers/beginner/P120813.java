package Programmers.beginner;

import java.util.stream.IntStream;

public class P120813 {
     public int[] solution(int n) {
        int[] answer = {};
        
         answer = IntStream.range(1, n + 1)
                .filter(num -> num % 2 == 1)
                .toArray();
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
