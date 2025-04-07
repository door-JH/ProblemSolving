package Programmers.beginner;

public class P120825 {

    public String solution(String my_string, int n) {
        String answer = "";

        for(int q = 0; q < my_string.length(); q++){

            for(int w = 0; w < n; w++){
                answer += my_string.charAt(q);
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
