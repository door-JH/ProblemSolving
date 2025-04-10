package Programmers.beginner;

public class P120841 {

    public static int solution(int[] dot) {
        int answer = 0;
        
        //x 축
        if(dot[0] > 0){
            return dot[1] > 0 ? 1 : 4;
        } else 
        if(dot[0] < 0){
            return dot[1] > 0 ? 2 : 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}