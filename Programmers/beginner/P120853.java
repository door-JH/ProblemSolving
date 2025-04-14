package Programmers.beginner;

public class P120853 {

    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");

        for(int q = 0; q < arr.length; q++){
            if(!arr[q].equals("Z")){
                answer += Integer.parseInt(arr[q]);
            } else {
                answer -= Integer.parseInt(arr[q -1]);
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        solution("1 2 Z 3");
    }
}
