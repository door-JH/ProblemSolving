package Programmers.beginner;

public class P120907 {

    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        String[] cal_str = {};
        boolean isEqual = false;
        int index = 0;

        for (String quizStr : quiz) {
            
            cal_str = quizStr.split(" ");

            if(cal_str[1].equals("-")){
                isEqual = Integer.parseInt(cal_str[0]) - Integer.parseInt(cal_str[2]) == Integer.parseInt(cal_str[4]);
            } else {
                isEqual = Integer.parseInt(cal_str[0]) + Integer.parseInt(cal_str[2]) == Integer.parseInt(cal_str[4]);
            }

            answer[index++] = isEqual ? "O" : "X";
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
