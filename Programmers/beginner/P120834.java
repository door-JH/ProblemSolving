package Programmers.beginner;

public class P120834 {
    public static String solution(int age) {
        String answer = "";
        String age_str = Integer.toString(age);

        for(int q = 0; q < age_str.length(); q++){
            answer += (char)(age_str.charAt(q) - '0' + 97);
        }


        return answer;
    }
    public static void main(String[] args) {
        
        System.out.println((char) (2 + 97));
        
        solution(23);
        
    }
}
