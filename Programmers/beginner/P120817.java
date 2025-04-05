package Programmers.beginner;

import java.util.Arrays;

public class P120817 {
    public double solution(int[] numbers) {
        double answer = 0;

        answer = Arrays.stream(numbers)
                .average().getAsDouble();

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
