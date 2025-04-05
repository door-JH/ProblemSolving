package Programmers.beginner;


public class P120815 {
    public static int solution(int n) {
        int result = 1;
        while((result * 6) % n != 0){
            result++;
        }
        return result;

    }

    public static void main(String[] args) {
        solution(10);
    }
}
