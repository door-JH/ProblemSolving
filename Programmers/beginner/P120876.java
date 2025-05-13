package Programmers.beginner;

import java.util.HashMap;
import java.util.Map;

public class P120876 {
    
    public static int[] startEndArr = new int[2];

    public static void setStartEnd(int a, int b){
        if(a <= b){
            startEndArr[0] = a;
            startEndArr[1] = b;
        } else {
            startEndArr[0] = b;
            startEndArr[1] = a;
        }
    }

    public static int solution(int[][] lines) {
        int answer = 0;
    
        for(int q = 1; q < lines.length; q++){
            
            setStartEnd(lines[0][0], lines[0][1]);
            
            for(int w = lines[q][0]; w <= lines[q][1]; w++){

                if(startEndArr[0] < w && w > startEndArr[1]){
                    answer++;
                }
                
            }

        }

        


        return answer;
    }

    public static void main(String[] args) {
        
        int[][] arr = {{0,1}, {2,5}, {3,9}};

    

        solution(arr);

    }
}
