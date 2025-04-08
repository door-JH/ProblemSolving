package Programmers.beginner;

public class P120839 {
    public String solution(String rsp) {
        String answer = "";

        for(int q = 0; q < rsp.length(); q++){

            switch (rsp.charAt(q)) {
                case '2':
                    answer += "0";
                    break;
                case '0':
                    answer += "5";
                    break;
                case '5':
                    answer += "2";
                    break;
                default:
                    break;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
