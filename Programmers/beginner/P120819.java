package Programmers.beginner;



public class P120819 {
    public static int[] solution(int money) {
        int[] answer = new int[2];

        while(money >= 5500){
            money -= 5500;
            answer[0]++;
        }

        answer[1] = money;

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
