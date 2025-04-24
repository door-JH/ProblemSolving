package Programmers.beginner;

import java.util.Arrays;

public class P120875 {

    public static int solution(int[][] dots) {
        int answer = 0;
        
        int[] arr_x = {dots[0][0], dots[1][0], dots[2][0], dots[3][0]};
        int[] arr_y = {dots[0][1], dots[1][1], dots[2][1], dots[3][1]};
        
        
       
        if(Math.abs(arr_x[0] - arr_x[1]) == Math.abs(arr_x[2] - arr_x[3])){
            if(Math.abs(arr_y[0] - arr_y[1]) == Math.abs(arr_y[2] - arr_y[3])){  
                answer = 1;
            }
        } else if(Math.abs(arr_x[0] - arr_x[2]) == Math.abs(arr_x[1] - arr_x[3])){
            if(Math.abs(arr_y[0] - arr_y[2]) == Math.abs(arr_y[1] - arr_y[3])){   
            answer = 1;
            }
        } else if(Math.abs(arr_x[0] - arr_x[1]) / Math.abs(arr_y[0] - arr_y[1]) == 
        Math.abs(arr_x[2] - arr_x[3]) / Math.abs(arr_y[2] - arr_y[3])){
            
            if(Math.abs(arr_x[0] - arr_x[1]) == Math.abs(arr_y[0] - arr_y[1]) && 
            Math.abs(arr_x[2] - arr_x[3]) == Math.abs(arr_y[2] - arr_y[3])){
                answer = 1;
            }

        } else if(Math.abs(arr_x[0] - arr_x[2]) / Math.abs(arr_y[0] - arr_y[2]) == 
        Math.abs(arr_x[1] - arr_x[3]) / Math.abs(arr_y[1] - arr_y[3])){
            if(Math.abs(arr_x[0] - arr_x[2]) == Math.abs(arr_y[0] - arr_y[2]) && 
            Math.abs(arr_x[1] - arr_x[3]) == Math.abs(arr_y[1] - arr_y[3])){
                answer = 1;
            }
        }


        
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 4},
            {9, 2},
            {3, 8},
            {11, 6}
        };

        int[][] arr1 = {
            {3, 5},
            {4, 1},
            {2, 4},
            {5, 10}
        };
        solution(arr1);
    }
}
