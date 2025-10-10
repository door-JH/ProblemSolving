package Programmers.Recommend.Conditional_Statements;

import java.util.Arrays;

public class P12935 {
    public boolean minCompare(int a, int b){
        return a > b ? true : false;
    }
    
    public int[] solution(int[] arr) {
        
        int value = Integer.MAX_VALUE;
        
        if(arr.length <= 1) return new int[]{-1};
        
        for(int i = 0; i < arr.length; i++){
            if(minCompare(value, arr[i])){
                value = arr[i];
            }
        }
        
        int filter = value;
        int[] answer = Arrays.stream(arr)
                            .filter(n -> n != filter)
                            .toArray();
        
        return answer;
    }
}
