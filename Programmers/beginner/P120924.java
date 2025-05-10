package Programmers.beginner;

public class P120924 {

    public static int solution(int[] common) {
        int answer = 0;
        
        int arrLength = common.length;
        
        int a = common[arrLength - 1] - common[arrLength - 2];
        int b = common[arrLength - 2] - common[arrLength - 3];
        
        if(a == b){
            answer = common[arrLength - 1] + a;
        } else {
            answer = common[arrLength - 1] * (b / a);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
