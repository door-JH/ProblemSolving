package Programmers.beginner;

public class P120906 {

    public static int solution(int n) {
        int answer = 0;
        int div = 10;
        int cnt = 1;
        while(n > 0){
            answer += n % div;
            n /= div;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(1234);
    }
}
