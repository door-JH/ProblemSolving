package Programmers.beginner;

public class P120892 {

    public String solution(String cipher, int code) {
        String answer = "";

        if(code == 1) return cipher;

        for(int q = 1; q <= cipher.length() / code; q++){
            if(q + code < cipher.length()){
               
                answer += cipher.charAt(code*q - 1);

            }
        }

        return answer;
    }

   public static void main(String[] args) {
    
   } 
}
