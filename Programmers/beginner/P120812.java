package Programmers.beginner;

import java.util.Arrays;

public class P120812 {
    public int solution(int[] array) {
        int cmp = 0;
        int answer = 0 ;
        int[] temp = new int[1001];

        Arrays.sort(array);

        for(int q = 0; q < array.length; q++){
            temp[array[q]] += 1;

        }

        for(int w = 0; w < temp.length; w++){
            if(temp[w] > cmp && temp[w] != 0) {
                cmp = temp[w];
                answer = w;
            } else if(temp[w] == cmp) {
                answer = -1;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
