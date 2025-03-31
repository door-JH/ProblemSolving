import java.util.Arrays;

public class P181852 {
    
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int index = 0;

        Arrays.sort(num_list);

        answer = new int[num_list.length - 5];

        for(int i = 5;  i < num_list.length; i++){
            answer[index++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        
    }
}
