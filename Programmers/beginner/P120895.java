package Programmers.beginner;

public class P120895 {

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";

        //abcdefg , 2, 5
        //ab f de c g
        answer = my_string.substring(0, num1) //0 2
                + my_string.charAt(num2)                    // 3
                + my_string.substring(num1 + 1, num2) // 4 5
                + my_string.charAt(num1)      //  6
                + my_string.substring(num2 + 1, my_string.length());
        
        
        return answer;
    }

    public static void main(String[] args) {
        solution("abcdefg", 2, 5);
    }
}
