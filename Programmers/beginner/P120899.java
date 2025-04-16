package Programmers.beginner;

public class P120899 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;
        for (int i : array) {
            if(i > max){
                max = i;
                answer[0] = max;
                answer[1] = index;
            }
            index++;
        }


        return answer;
    }

    public static void main(String[] args) {
        
    }
}
