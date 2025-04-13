package Programmers.beginner;

import java.util.Arrays;

public class P120847 {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }

    public static void main(String[] args) {
        
    }
}
