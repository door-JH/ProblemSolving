package Programmers.beginner;

import java.util.Arrays;

public class P120868 {
    
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        
        System.out.println(sides[0] + " " + sides[1]);
        answer += sides[1] - (sides[1] - sides[0]);

        answer += (sides[1] + sides[0]) - (sides[1] + 1);


        

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
