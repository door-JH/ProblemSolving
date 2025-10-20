package Programmers.Recommend.Conditional_Statements;

public class P12940 {
    public int GCD(int n, int m){
        int temp = 1;
        while (m != 0){
            temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    
    public int LCM(int n, int m){
        return n * m / GCD(n, m);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = GCD(n, m);
        answer[1] = LCM(n, m);
        
        return answer;
    }
}
