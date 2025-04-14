package Programmers.beginner;

public class P120891 {

    public static int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '3') answer++;
            if(str.charAt(i) == '6') answer++;
            if(str.charAt(i) == '9') answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
       solution(3);
    }
}
