package Programmers.beginner;

public class P120884 {
    
    public static int solution(int chicken) {
        int answer = 0;
        int service = 0;
        
        while(chicken > 9){
        service += chicken / 10;
        chicken = (chicken/10)+(chicken % 10);
            
        }
        answer = service;
        return answer;
    }

    public static void main(String[] args) {
        solution(997281);
    }
}
