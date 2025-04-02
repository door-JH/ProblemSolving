package Programmers.beginner;

import java.util.Arrays;

public class P120809 {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers)
                            .map(n -> n * 2)
                            .toArray();

        return answer;
    }
}
