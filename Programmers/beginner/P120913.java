package Programmers.beginner;

public class P120913 {

    public static String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[length];
        int index = 0;
        int cnt = 0;

        answer[0] = "";
        while(cnt != my_str.length()){
            if(cnt % n == 0 && cnt > 0){
                index++;
                answer[index] = "";
            }

            answer[index] += my_str.charAt(cnt++);

        }
        



        return answer;
    }
    

    public static void main(String[] args) {
        solution("abc1Addfggg4556b", 6);
    }
}
