package Programmers.beginner;

import java.util.Arrays;

public class P120835 {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] mappingArr = Arrays.copyOf(emergency, emergency.length);
        
        int rank = emergency.length;

        //[76, 24, 3] <-> [3,76,24]
        Arrays.sort(emergency);

        for(int q = 0; q < emergency.length; q++){
            for(int w = 0; w < mappingArr.length; w++){

                if(emergency[q] == mappingArr[w]){
                    answer[w] = rank--;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
