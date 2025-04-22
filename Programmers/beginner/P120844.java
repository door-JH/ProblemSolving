package Programmers.beginner;


import java.util.Arrays;



public class P120844 {

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int index = 0;

        if(direction.equals("left")){
            answer = 
                Arrays.copyOfRange(numbers, 1, numbers.length + 1);
            answer[answer.length - 1] = numbers[0];
        } else {
            answer[0] = numbers[numbers.length - 1];
        
            for(int q = 1; q < answer.length; q++){
                answer[q] = numbers[index++];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        
        solution(arr, "right");

    }
}
