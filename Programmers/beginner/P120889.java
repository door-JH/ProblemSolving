package Programmers.beginner;

import java.util.Arrays;

public class P120889 {

    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        answer = sides[0] + sides[1] > sides[2] ? 1 : 2;

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
