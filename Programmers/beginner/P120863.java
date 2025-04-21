package Programmers.beginner;

public class P120863 {

    public String solution(String polynomial) {
        String answer = "";
        String[] poly_arr = polynomial.split(" ");
        
        int number = 0;
        int x_number = 0;
        for (String str : poly_arr) {

            // x항
            if(str.charAt(str.length() - 1) == 'x'){

                if(str.length() == 1){
                    x_number++;
                } else {
                    x_number += Integer.parseInt(str.substring(0, str.length() - 1));
                }


            //정수항
            } else if(str.charAt(0) != '+'){
                number += Integer.parseInt(str);
            }
        }
        
        
        
        answer = x_number != 1 ? Integer.toString(x_number) + "x" : "x";

        answer = number != 0 ? answer +=  " + " + Integer.toString(number) : answer;
        if(x_number == 0) answer = Integer.toString(number); 
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
    
}
