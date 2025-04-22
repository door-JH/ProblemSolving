package Programmers.beginner;

public class P120864 {
    public int solution(String my_string) {
        int answer = 0;
        String[] num_str = my_string.split("[^0-9]+");

        for (String str : num_str) {
            if(!str.equals("")) answer += Integer.parseInt(str);
        }

        return answer;
    }
    public static void main(String[] args) {
        
    }
}
