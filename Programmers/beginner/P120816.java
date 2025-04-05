package Programmers.beginner;

public class P120816 {
    public static int solution(int slice, int n) {
        int result = 1;
        while((result * slice) < n){
            result++;
        }
        return result;

    }

    public static void main(String[] args) {
        solution(7,10);
    }
}
