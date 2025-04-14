package Programmers.beginner;

public class P120893 {

    public String solution(String my_string) {
        String answer = "";

        for(int q = 0; q < my_string.length(); q++){
            if((int) my_string.charAt(q) >= 97){
                answer += (my_string.charAt(q) + "").toUpperCase();
            } else {
                answer += (my_string.charAt(q) + "").toLowerCase();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println((int) 'a');
    }
}
