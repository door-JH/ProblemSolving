package Programmers.beginner;

public class P120909 {
    
    public static int solution(int n) {
        int answer = 1;

        int num = 0;

        while(n > num){

            num = (int) Math.pow(answer++, 2);
        }   

        answer = n == num ? 1 : 2;

        return answer;
    }

    public static void main(String[] args) {
        solution(144);
    }
}
