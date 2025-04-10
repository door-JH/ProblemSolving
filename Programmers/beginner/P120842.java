package Programmers.beginner;

import java.util.Arrays;

public class P120842 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / 2][n];
        
        int cnt = 0;
        //1 2 3 4 
        for(int i = 0; i < num_list.length / n; i++){
            
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[cnt++];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
