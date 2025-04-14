package Programmers.beginner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120890 {

    public static int solution(int[] array, int n) {
        int answer = 0;
        int value = 100;
        int index = 0;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(Math.abs(array[i] - n) < value){
                value = Math.abs(array[i] - n);
                index = i;
                
            }
        }

        for (int i : array) {
            if(array[index] > i && array[index] - n == i){
                answer = i;
            } else {
                answer = array[index];
            }
        }

        
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3,10,28};
        solution(arr, 20);
    }
}
