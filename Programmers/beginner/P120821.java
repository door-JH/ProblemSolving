package Programmers.beginner;

public class P120821 {

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = num_list.length - 1; i >= 0; i--){
            System.out.println(num_list.length - i - 1+ " " + i);
            answer[num_list.length - i - 1] = num_list[i];

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        solution(arr);
    }
}
