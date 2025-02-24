import java.util.Arrays;

public class P181927 {

    public static int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
