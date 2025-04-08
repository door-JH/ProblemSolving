package Programmers.beginner;

public class P120837 {
    public static int solution(int hp) {
        
        int answer = 0;

        //5, 3, 1
        while(hp > 0){
            if(hp >= 5){
                hp -= 5;
                answer++;
            } else if(hp >= 3){
                hp -= 3;
                answer++;
            } else if(hp >= 1){
                hp -= 1;
                answer++;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        solution(999);
    }
}
