package Programmers.beginner;

import java.util.Arrays;

public class P120923 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 1000;
        int cnt = -1;

        while(sum != total){
            sum = 0;
            cnt++;
            for(int i = 1; i <= num; i++ ){
                sum += (1000 - cnt - i);
                answer[i - 1] = (1000 - cnt - i);
            }
            
        }
        Arrays.sort(answer);
        for (int i : answer) {
            System.out.println(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(5, 0);
    }
}
