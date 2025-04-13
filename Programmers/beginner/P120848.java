package Programmers.beginner;

public class P120848 {

    public static int solution(int n) {
        int sum = 1;
        int cnt = 0;
        while(n > sum){
            cnt++;
            sum *= cnt;
        }

        if(n != sum) cnt--;
        
        return cnt;
    }
    
    public static void main(String[] args) {
        solution(3628800);
    }
}
