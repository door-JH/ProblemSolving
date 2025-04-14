package Programmers.beginner;

public class P120854 {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];   
        int index = 0;
        for (String str : strlist) {
            answer[index++] = str.length();
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
