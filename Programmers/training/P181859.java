import java.util.ArrayList;
import java.util.List;

public class P181859 {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int i = 0;

        for(int n = 0; n < arr.length; n++){

            if(list.size() == 0){
                list.add(arr[i++]);
            } else if(list.get(list.size() - 1) == arr[i]){
                list.remove(list.size() - 1);
                i++;
            } else {
                list.add(arr[i++]);
            }

        }

        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            for(int q = 0; q < list.size(); q++){
             answer[q] = list.get(q);   
            }

        }
        
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0};
        for (int num : solution(arr)) {
            System.out.println(num);
        }
    }
}
