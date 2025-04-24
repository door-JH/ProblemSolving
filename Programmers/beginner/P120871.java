package Programmers.beginner;

public class P120871 {
    
    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;

        
        
        while(cnt != n){

            if(answer % 3 == 0 || answer % 10 == 3 || answer / 10 == 3 || answer / 10 == 13){
                answer++;
            } else {
                
                cnt++;
                if(cnt == n) return answer;
                answer++;
            }
            
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //solution(40);
    }
}
