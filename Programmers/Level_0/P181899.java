import java.util.ArrayList;
import java.util.List;

public class P181899 {

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        int number = start_num;
        for(int i = 0; i < answer.length; i++){

            answer[i] = number--;
            
        }

        
        return answer;
    }

    public static void main(String[] args) {
        solution(10,3);
    }
}
