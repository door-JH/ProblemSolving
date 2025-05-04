package Programmers.beginner;

import java.util.Arrays;

public class P120882 {

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        double[] avgArr = new double[score.length];
        for(int q = 0; q < score.length; q++){
            avgArr[q] = (double)(score[q][0] + score[q][1]) / 2;
        }

        double[] sortArr = Arrays.copyOf(avgArr, avgArr.length);
        Arrays.sort(sortArr);

        double temp = 0;
        double target = 0;

        int rank = 0;
        int s_rank = 0;
        
        int index = 0;
        for(int w = sortArr.length - 1; w >= 0; w--){

            rank += 1;

            for(int r = 0; r < answer.length; r++){
                if(sortArr[w] == avgArr[r]){
                    target = avgArr[r];
                    index = r;
                }

                if(temp != target){
                    s_rank = rank;
                    answer[index] = rank;
                } else {
                    answer[index] = s_rank;
                }
                
            }
        
            temp = target;
            
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        int[][] scores = {
            {80, 70},
            {70, 80},
            {30, 50},
            {90, 100},
            {100, 90},
            {100, 100},
            {10, 30}
        };
        
        

        solution(scores);
    }
}
