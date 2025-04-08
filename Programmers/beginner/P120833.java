package Programmers.beginner;

public class P120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int cnt = 0;
        
        for(int q = num1; q <= num2; q++){
            answer[cnt++] = numbers[q];
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
